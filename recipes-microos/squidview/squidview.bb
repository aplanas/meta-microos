SUMMARY = "Interactive console program which monitors squid logs access"
DESCRIPTION = "Squidview is an interactive console program which monitors \
and displays squid logs in a nice fashion, and may then go \
deeper with searching and reporting functions. \
 \
If you don't know what squid is or does this program is probably not for you. \
 \
To use squidview you must at least have read access to squid's \
access.log file. You may need to see your administrator for this. \
Squidview uses this text log file for all operations. \
It does not generate its own database for tasks"
LICENSE = "GPL-2.0"

PV = "0.86"

RPM_NAME = "squidview-0.86-1.22.aarch64.rpm"
RPM_HASH = "bdb922fd7536a1f36664831e027c117f406d4e05b40da0743516193c7f8b818a588c62d22e965615732fdf3407d186b975406554f2c7add282ea5adf77777e63"

RPROVIDES:${PN} += "squidview squidview(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libncurses.so.6()(64bit) libncurses.so.6(NCURSEST6_5.7.20081102)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit)"

inherit rpm
