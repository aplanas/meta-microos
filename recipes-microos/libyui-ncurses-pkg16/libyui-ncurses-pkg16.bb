SUMMARY = "Libyui - yast2 package selector widget for the NCurses UI"
DESCRIPTION = "This package contains the NCurses (text based) package selector \
component for libyui."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "4.5.2"

RPM_NAME = "libyui-ncurses-pkg16-4.5.2-1.1.aarch64.rpm"
RPM_HASH = "82d655d2f144e91726d7eb450a242fe18fbb238c2353d53196f79e4c09f216380ba295f70db0307c8e4c257d67a8af30cdd01cda8a465ac4073adf10d10fa3f3"

RPROVIDES:${PN} += "libyui-ncurses-pkg libyui-ncurses-pkg.so.16()(64bit) libyui-ncurses-pkg16 libyui-ncurses-pkg16(aarch-64) libyui_pkg yast2-ncurses-pkg"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgcc_s.so.1(GCC_4.5.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit) libyui-ncurses16 libyui.so.16()(64bit) libyui16 libzypp libzypp.so.1722()(64bit) libzypp.so.1722(ZYPP_plain)(64bit)"

inherit rpm
