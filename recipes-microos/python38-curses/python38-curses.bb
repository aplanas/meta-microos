SUMMARY = "Python Interface to the (N)Curses Library"
DESCRIPTION = "An easy to use interface to the (n)curses CUI library. CUI stands for \
Console User Interface."
LICENSE = "Python-2.0"

PV = "3.8.16"

RPM_NAME = "python38-curses-3.8.16-7.1.aarch64.rpm"
RPM_HASH = "b72810c1b8af8c593582282ea68a31e9d4e2a9ef89dc41a5f7e7a9abe6d9e0e3e8d03e4ba318fd7dabc4f6cd9746e3e1dd1b2a092e19640109fc65d626432c51"

RPROVIDES:${PN} += "python38-curses python38-curses(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libncursesw.so.6()(64bit) libncursesw.so.6(NCURSESTW6_5.7.20081102)(64bit) libncursesw.so.6(NCURSESTW6_5.8.20110226)(64bit) libpanelw.so.6()(64bit) libpanelw.so.6(NCURSESTW6_5.7.20081102)(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit) python(abi) python38"

inherit rpm
