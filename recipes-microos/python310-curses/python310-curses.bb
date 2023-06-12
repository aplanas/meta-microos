SUMMARY = "Python Interface to the (N)Curses Library"
DESCRIPTION = "An easy to use interface to the (n)curses CUI library. CUI stands for \
Console User Interface."
LICENSE = "Python-2.0"

PV = "3.10.11"

RPM_NAME = "python310-curses-3.10.11-1.1.aarch64.rpm"
RPM_HASH = "989f5717de0ed77ebdb97e392dcce81bc26314d7552268c0eb4edd673b726702604ac8caaaebbbd3dd64251d4d37a739e0b146d9d50e76a9c2ffed39cd45d8a7"

RPROVIDES:${PN} += "python3-curses \
python310-curses \
python310-curses(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libncursesw.so.6()(64bit) \
libncursesw.so.6(NCURSESTW6_5.7.20081102)(64bit) \
libncursesw.so.6(NCURSESTW6_5.8.20110226)(64bit) \
libncursesw.so.6(NCURSESTW6_6.1.20171230)(64bit) \
libpanelw.so.6()(64bit) \
libpanelw.so.6(NCURSESTW6_5.7.20081102)(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit) \
python(abi) \
python310"

inherit rpm
