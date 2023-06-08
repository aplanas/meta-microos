SUMMARY = "Libyui - NCurses (text based) user interface"
DESCRIPTION = "This package contains the NCurses (text based) user interface \
component for libyui."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "4.5.2"

RPM_NAME = "libyui-ncurses16-4.5.2-1.1.aarch64.rpm"
RPM_HASH = "cdf9a97ff0fb85c372d5153ebf0e7429510ffdf038ff988f533cefa5d8e398a053b5f00d02c53daccbbc1563d8cca0ed22b35181bea7c7b5c991cf4aab7709ca"

RPROVIDES:${PN} += "libyui-ncurses libyui-ncurses.so.16()(64bit) libyui-ncurses16 libyui-ncurses16(aarch-64) yast2-ncurses yui_backend"
RDEPENDS:${PN} += "/sbin/ldconfig glibc-locale-base ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libncursesw.so.6()(64bit) libncursesw.so.6(NCURSESTW6_5.7.20081102)(64bit) libncursesw.so.6(NCURSESTW6_5.8.20110226)(64bit) libpanelw.so.6()(64bit) libpanelw.so.6(NCURSESTW6_5.7.20081102)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit) libyui.so.16()(64bit) libyui16"

inherit rpm
