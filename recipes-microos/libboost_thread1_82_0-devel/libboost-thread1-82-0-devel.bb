SUMMARY = "Development headers for Boost.Thread library"
DESCRIPTION = "This package contains development headers for Boost.Thread library."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_thread1_82_0-devel-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "3230d664a028d31a39ed2ac48713caa7500e7605626f7591cea705a7e5e9a88fcc37a6f222a55f6888a7b4e7d3d440b42ee84f6066b998287ca0292158e563c5"

RPROVIDES:${PN} += "libboost_thread-devel-impl libboost_thread1_82_0-devel libboost_thread1_82_0-devel(aarch-64)"
RDEPENDS:${PN} += "libboost_chrono1_82_0-devel libboost_date_time1_82_0-devel libboost_headers1_82_0-devel libboost_thread1_82_0"

inherit rpm
