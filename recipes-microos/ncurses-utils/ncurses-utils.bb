SUMMARY = "Tools using the new curses libraries"
DESCRIPTION = "The ncurses based utilities are as follows: \
 \
clear -- emits clear-screen for current terminal \
 \
tabs -- set tabs on a terminal \
 \
toe   -- table of entries utility \
 \
tput  -- shell-script access to terminal capabilities. \
 \
tset  -- terminal-initialization utility \
 \
reset -- terminal initialization utility"
LICENSE = "MIT"

PV = "6.4.20230429"

RPM_NAME = "ncurses-utils-6.4.20230429-11.1.aarch64.rpm"
RPM_HASH = "c1b2c6e9ec6c839ba95bb835904141906f73e8e76e473de7e1e036b6087c73710225b9c52befc49112fe9a9d7d1534ee5cf0beeb0003a26593d7d887fdc6416c"

RPROVIDES:${PN} += "ncurses-utils ncurses-utils(aarch-64) ncurses:/usr/bin/tput"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libticw.so.6()(64bit) libticw.so.6(NCURSES6_TIC_5.0.19991023)(64bit) libticw.so.6(NCURSES6_TIC_5.1.20000708)(64bit) libticw.so.6(NCURSES6_TIC_5.5.20051010)(64bit) libticw.so.6(NCURSES6_TIC_5.9.20150530)(64bit) libticw.so.6(NCURSES6_TIC_6.1.20171230)(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TIC_6.1.20171230)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.1.20000708)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.2.20001021)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.3.20021019)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.4.20040208)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.5.20051010)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.6.20061217)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.9.20150530)(64bit) libtinfo.so.6(NCURSES6_TINFO_6.1.20171230)(64bit) libtinfo.so.6(NCURSES6_TINFO_6.2.20211010)(64bit)"

inherit rpm
