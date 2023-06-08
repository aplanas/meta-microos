SUMMARY = "Pager for PostgreSQL, MariaDB, Percona, and MySQL"
DESCRIPTION = "Advanced pager for PostgreSQL and MySQL databases. \
Everybody who uses psql uses less pager. It is working well, but there is \
not any special support for tabular data. Tabular data related features \
are core functionality of this pager."
LICENSE = "BSD-2-Clause"

PV = "1.9.0"

RPM_NAME = "pspg-1.9.0-1.15.aarch64.rpm"
RPM_HASH = "7372b58aac7e3bae5443c6589024b224e2a0506ccbbc59bf6c940dd95c3068ebe66df976fa797ece63dc60e1a460280865d66f07e127f91c53a77bac867061fd"

RPROVIDES:${PN} += "pspg pspg(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libncursesw.so.6()(64bit) libncursesw.so.6(NCURSESTW6_5.7.20081102)(64bit) libpanelw.so.6()(64bit) libpanelw.so.6(NCURSESTW6_5.7.20081102)(64bit) libreadline.so.8()(64bit) libreadline.so.8(READLINE_6.3)(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.1.20000708)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.4.20040208)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit)"

inherit rpm
