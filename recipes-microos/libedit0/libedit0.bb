SUMMARY = "Command Line Editing and History Library"
DESCRIPTION = "libedit is a command line editing and history library. It is designed \
to be used by interactive programs that allow the user to type commands \
at a terminal prompt."
LICENSE = "BSD-3-Clause"

PV = "20210910.3.1"

RPM_NAME = "libedit0-20210910.3.1-2.1.aarch64.rpm"
RPM_HASH = "4b4ddb57bcf152ef43ef93c5a463e94bef33f525fb37054d37e9ebcec5f3cd8dc41b44902971a6ade22954dbc3af05105bffbef91e39410aae5e898b638f0340"

RPROVIDES:${PN} += "libedit \
libedit.so.0()(64bit) \
libedit0 \
libedit0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit)"

inherit rpm
