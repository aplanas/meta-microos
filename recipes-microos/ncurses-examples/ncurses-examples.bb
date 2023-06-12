SUMMARY = "Tools using the new curses libraries"
DESCRIPTION = "The ncurses based test programs, that is a set of tools \
showing the features of the new curses libraries."
LICENSE = "MIT"

PV = "6.4.20230520"

RPM_NAME = "ncurses-examples-6.4.20230520-13.1.aarch64.rpm"
RPM_HASH = "687a0559f457e511d71aab2724cf5e48724bff94680cc7e9b828f641967453fd34e181ed07f8f751fb26dec18c6e6016a88c7a078969c48cf1581005ce61ac3a"

RPROVIDES:${PN} += "ncurses-examples ncurses-examples(aarch-64) ncurses-tests"
RDEPENDS:${PN} += "/bin/bash /bin/sh /usr/bin/bash /usr/bin/perl ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libformw.so.6()(64bit) libformw.so.6(NCURSESTW6_5.7.20081102)(64bit) libformw.so.6(NCURSESTW6_5.9.20150530)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libmenuw.so.6()(64bit) libmenuw.so.6(NCURSESTW6_5.7.20081102)(64bit) libncursesw.so.6()(64bit) libncursesw.so.6(NCURSESTW6_5.7.20081102)(64bit) libncursesw.so.6(NCURSESTW6_5.8.20110226)(64bit) libncursesw.so.6(NCURSESTW6_5.9.20150530)(64bit) libncursesw.so.6(NCURSESTW6_6.1.20171230)(64bit) libpanelw.so.6()(64bit) libpanelw.so.6(NCURSESTW6_5.7.20081102)(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.1.20000708)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.4.20040208)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.8.20110226)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.9.20150530)(64bit) libtinfo.so.6(NCURSES6_TINFO_6.4.current)(64bit) ncurses-utils"

inherit rpm
