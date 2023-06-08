SUMMARY = "Development headers for Boost.System library"
DESCRIPTION = "This package contained Boost.System development library. It is no \
longer required as the library is headers only."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_system1_82_0-devel-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "9f63ff273b5fe6766496d815f1a05da9f4208988766894b3d96f47094ffa15025955547890285d91f9a6bfdcbd6ff7206f79b638319495fa8408ea4ec52dfdaf"

RPROVIDES:${PN} += "libboost_system-devel-impl libboost_system1_82_0-devel libboost_system1_82_0-devel(aarch-64)"
RDEPENDS:${PN} += "libboost_headers1_82_0-devel libboost_system1_82_0"

inherit rpm
