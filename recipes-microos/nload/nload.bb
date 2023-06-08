SUMMARY = "Monitors network traffic and bandwidth usage"
DESCRIPTION = "nload is a console application which monitors network traffic and bandwidth \
usage in real time. It visualizes the in- and outgoing traffic using two graphs \
and provides additional info like total amount of transfered data and min/max \
network usage."
LICENSE = "GPL-2.0+"

PV = "0.7.4"

RPM_NAME = "nload-0.7.4-1.30.aarch64.rpm"
RPM_HASH = "4ebc8ad8fae1accb14cac2c8197c80326ffd757b9b02d84be95e821b0402076ac3c138bf54dc537e312c67f0365c511dea9017570e0481ed1e5fd677a5b789a0"

RPROVIDES:${PN} += "nload nload(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libform.so.6()(64bit) libform.so.6(NCURSESTW6_5.7.20081102)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libncurses.so.6()(64bit) libncurses.so.6(NCURSEST6_5.7.20081102)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit)"

inherit rpm
