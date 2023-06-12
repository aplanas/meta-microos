SUMMARY = "Development headers for Boost.Nowide libraries"
DESCRIPTION = "Development headers for Boost.Nowide* boost libraries."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_nowide1_82_0-devel-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "a87f6e6e135b907ad74ae38bdddd50d2d2db0ddc6fa1628960c45c5f0da05d84cfb40590a15121273f6fd9d631fc4bdd8c596a4b28a5750a69c766eaf7492a18"

RPROVIDES:${PN} += "boost-nowide-devel-impl libboost_nowide1_82_0-devel libboost_nowide1_82_0-devel(aarch-64)"
RDEPENDS:${PN} += "libboost_nowide1_82_0"

inherit rpm
