SUMMARY = "Development headers for Boost.Log library"
DESCRIPTION = "Development headers for Boost.Log library which aims to make logging \
significantly easier for the application developer. It provides a wide \
range of out-of-the-box tools along with public interfaces for extending \
the library."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_log1_82_0-devel-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "60026a56f3f2f786e43d6d1156b7ffc7fd77df14cb93ef0fddb20a1e4ae90e1e293465459061eb6d3e8c884b28a5628e4827cda1484d0cbb9fe1815bf6641c88"

RPROVIDES:${PN} += "libboost_log-devel-impl libboost_log1_82_0-devel libboost_log1_82_0-devel(aarch-64)"
RDEPENDS:${PN} += "libboost_atomic1_82_0-devel libboost_chrono1_82_0-devel libboost_date_time1_82_0-devel libboost_filesystem1_82_0-devel libboost_headers1_82_0-devel libboost_log1_82_0 libboost_regex1_82_0-devel libboost_thread1_82_0"

inherit rpm
