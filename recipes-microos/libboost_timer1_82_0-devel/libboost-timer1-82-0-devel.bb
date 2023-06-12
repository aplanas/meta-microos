SUMMARY = "Development headers for Boost.Timer library"
DESCRIPTION = "This package contains development headers for Boost.Timer library."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_timer1_82_0-devel-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "132b31491e88c20c5a99f4a97b20c16b8e90654be905930c05be488b08d9c35a279206a5fc86feea7bb17a7bbd5dd676c7baf61da8c0672ac979ec426207c6b9"

RPROVIDES:${PN} += "libboost_timer-devel-impl \
libboost_timer1_82_0-devel \
libboost_timer1_82_0-devel(aarch-64)"
RDEPENDS:${PN} += "libboost_chrono1_82_0-devel \
libboost_headers1_82_0-devel \
libboost_timer1_82_0"

inherit rpm
