SUMMARY = "Libyui - NCurses (text based) user interface"
DESCRIPTION = "This package contains the NCurses (text based) user interface \
component for libyui."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "4.6.0"

RPM_NAME = "libyui-ncurses16-4.6.0-1.1.aarch64.rpm"
RPM_HASH = "e90a703e05ff5ae12d629cfb4214b4daa813edd5a71bb6d8084ff2769f235a1f682df0d5b7de939c87b969143a51627a9fed28ae7fc0e83b97918156c10cfdae"

RPROVIDES:${PN} += "libyui-ncurses libyui-ncurses.so.16()(64bit) libyui-ncurses16 libyui-ncurses16(aarch-64) yast2-ncurses yui_backend"
RDEPENDS:${PN} += "/sbin/ldconfig glibc-locale-base ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libncursesw.so.6()(64bit) libncursesw.so.6(NCURSESTW6_5.7.20081102)(64bit) libncursesw.so.6(NCURSESTW6_5.8.20110226)(64bit) libpanelw.so.6()(64bit) libpanelw.so.6(NCURSESTW6_5.7.20081102)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit) libyui.so.16()(64bit) libyui16"

inherit rpm
