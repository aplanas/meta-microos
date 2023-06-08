SUMMARY = "Python Interface to the (N)Curses Library"
DESCRIPTION = "An easy to use interface to the (n)curses CUI library. CUI stands for \
Console User Interface."
LICENSE = "Python-2.0"

PV = "3.12.0a7"

RPM_NAME = "python312-curses-3.12.0a7-1.1.aarch64.rpm"
RPM_HASH = "0a055ec79b58dcff13dccda6f14379b70ff1bd928abb74a989851c4f70c9e25074ed6e8b4f258a364ac07bfb8bc671978de8dde9a0b8763c344e9a4104bee663"

RPROVIDES:${PN} += "python312-curses python312-curses(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libncursesw.so.6()(64bit) libncursesw.so.6(NCURSESTW6_5.7.20081102)(64bit) libncursesw.so.6(NCURSESTW6_5.8.20110226)(64bit) libncursesw.so.6(NCURSESTW6_6.1.20171230)(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit) python(abi) python312"

inherit rpm
