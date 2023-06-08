SUMMARY = "Python Interface to the (N)Curses Library"
DESCRIPTION = "An easy to use interface to the (n)curses CUI library. CUI stands for \
Console User Interface."
LICENSE = "Python-2.0"

PV = "3.10.10"

RPM_NAME = "python310-curses-3.10.10-2.3.aarch64.rpm"
RPM_HASH = "0c792186badfcbabd9189e7c1e30d6d837e4bef929018b75a81f993ae82dd6cad2b3c99c7a6b0ce8f4466578e1db1af54f05eb0c802ef8787f1c1359dcf01930"

RPROVIDES:${PN} += "python3-curses python310-curses python310-curses(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libncursesw.so.6()(64bit) libncursesw.so.6(NCURSESTW6_5.7.20081102)(64bit) libncursesw.so.6(NCURSESTW6_5.8.20110226)(64bit) libncursesw.so.6(NCURSESTW6_6.1.20171230)(64bit) libpanelw.so.6()(64bit) libpanelw.so.6(NCURSESTW6_5.7.20081102)(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit) python(abi) python310"

inherit rpm
