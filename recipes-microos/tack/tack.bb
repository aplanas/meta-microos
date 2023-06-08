SUMMARY = "Terminfo action checker"
DESCRIPTION = "This package contains the tack utility to help to build a new terminfo \
entry describing an unknown terminal. It can also be used to test the \
correctness of an existing entry, and to develop the correct pad \
timings needed to ensure that screen updates do not fall behind the \
incoming data stream."
LICENSE = "GPL-2.0-or-later"

PV = "1.09.20221229"

RPM_NAME = "tack-1.09.20221229-11.1.aarch64.rpm"
RPM_HASH = "29270fabbdf99d54fdf36f1287f11d05dd5bf5ec058dd4bfe767ce192c58c201ac78478118f011584e0c29d270dd566e5babcade666b26fea3e544d71495284d"

RPROVIDES:${PN} += "ncurses-devel:/usr/bin/tack tack tack(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit) ncurses"

inherit rpm
