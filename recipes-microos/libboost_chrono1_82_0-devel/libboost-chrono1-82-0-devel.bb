SUMMARY = "Development headers for Boost.Chrono library"
DESCRIPTION = "This package contains Boost.Chrono development headers."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_chrono1_82_0-devel-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "9f9dccd3c368149c6fba2e6934f694114c648a744bc4f9ab4af368af6d8dadea193223b5779edad4867cfabc6a496e57845184ddf1d1c70e8ea4e85d1158abe8"

RPROVIDES:${PN} += "libboost_chrono-devel-impl libboost_chrono1_82_0-devel libboost_chrono1_82_0-devel(aarch-64)"
RDEPENDS:${PN} += "libboost_chrono1_82_0 libboost_headers1_82_0-devel"

inherit rpm
