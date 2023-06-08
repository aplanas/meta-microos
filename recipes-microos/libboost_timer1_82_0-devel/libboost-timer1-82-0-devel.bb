SUMMARY = "Development headers for Boost.Timer library"
DESCRIPTION = "This package contains development headers for Boost.Timer library."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_timer1_82_0-devel-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "9ba3f036dede7df8be9a77083f06a5f217a3df4b16ddf8766c34fa6c1ff27f02bc7075867e64ffbd52cf720badbfa5086bc2f9a1b0adac45fdf8bd579d80a1d6"

RPROVIDES:${PN} += "libboost_timer-devel-impl libboost_timer1_82_0-devel libboost_timer1_82_0-devel(aarch-64)"
RDEPENDS:${PN} += "libboost_chrono1_82_0-devel libboost_headers1_82_0-devel libboost_timer1_82_0"

inherit rpm
