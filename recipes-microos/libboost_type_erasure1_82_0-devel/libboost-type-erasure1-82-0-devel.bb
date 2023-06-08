SUMMARY = "Development headers for Boost.TypeErasure library"
DESCRIPTION = "This package contains development headers for Boost.TypeErasure library."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_type_erasure1_82_0-devel-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "27b02fb6b5c0ed22a7ad0d3fd66598c4fa5604d23ca13ecb6e7eca04c5f2ef0e57502312deec467fc3dd8cf9520bcd712d4aed84040e9e808c6fb74077afc9f1"

RPROVIDES:${PN} += "libboost_type_erasure-devel-impl libboost_type_erasure1_82_0-devel libboost_type_erasure1_82_0-devel(aarch-64)"
RDEPENDS:${PN} += "libboost_chrono1_82_0-devel libboost_headers1_82_0-devel libboost_system1_82_0-devel libboost_thread1_82_0-devel libboost_type_erasure1_82_0"

inherit rpm
