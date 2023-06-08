SUMMARY = "Development headers for Boost.Locale library"
DESCRIPTION = "This package contains development headers for Boost.Locale library."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_locale1_82_0-devel-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "24fdfba03aee32a90ad3e70534d67a75eb7be66266877fb231f90b4a0c0d534fdae0a271c1271559c42848d322849f11705f7541c83ff4bd9ce1d807c04931ae"

RPROVIDES:${PN} += "libboost_locale-devel-impl libboost_locale1_82_0-devel libboost_locale1_82_0-devel(aarch-64)"
RDEPENDS:${PN} += "libboost_chrono1_82_0-devel libboost_headers1_82_0-devel libboost_locale1_82_0 libboost_system1_82_0-devel libboost_thread1_82_0-devel libicu-devel"

inherit rpm
