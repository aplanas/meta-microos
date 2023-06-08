SUMMARY = "Tools using the new curses libraries"
DESCRIPTION = "The ncurses based test programs, that is a set of tools \
showing the features of the new curses libraries."
LICENSE = "MIT"

PV = "6.4.20230429"

RPM_NAME = "ncurses-examples-6.4.20230429-11.1.aarch64.rpm"
RPM_HASH = "f9244248afef3422e4a9e141ba15d5fe05986676711cc1361b39952d36c783db6f2d3331846ea517a2867ced238e833e66b77233f91c6c8d5a3b515423c03013"

RPROVIDES:${PN} += "ncurses-examples ncurses-examples(aarch-64) ncurses-tests"
RDEPENDS:${PN} += "/bin/bash /bin/sh /usr/bin/bash /usr/bin/perl ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libformw.so.6()(64bit) libformw.so.6(NCURSESTW6_5.7.20081102)(64bit) libformw.so.6(NCURSESTW6_5.9.20150530)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libmenuw.so.6()(64bit) libmenuw.so.6(NCURSESTW6_5.7.20081102)(64bit) libncursesw.so.6()(64bit) libncursesw.so.6(NCURSESTW6_5.7.20081102)(64bit) libncursesw.so.6(NCURSESTW6_5.8.20110226)(64bit) libncursesw.so.6(NCURSESTW6_5.9.20150530)(64bit) libncursesw.so.6(NCURSESTW6_6.1.20171230)(64bit) libpanelw.so.6()(64bit) libpanelw.so.6(NCURSESTW6_5.7.20081102)(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.1.20000708)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.4.20040208)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.8.20110226)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.9.20150530)(64bit) libtinfo.so.6(NCURSES6_TINFO_6.4.current)(64bit) ncurses-utils"

inherit rpm
