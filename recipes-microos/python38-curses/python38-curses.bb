SUMMARY = "Python Interface to the (N)Curses Library"
DESCRIPTION = "An easy to use interface to the (n)curses CUI library. CUI stands for \
Console User Interface."
LICENSE = "Python-2.0"

PV = "3.8.16"

RPM_NAME = "python38-curses-3.8.16-6.1.aarch64.rpm"
RPM_HASH = "722859414b808675668eea2433587ea4f49cb683d768731738b9dfebc6c2339c797c6320cea9dc4b8f5803a3fd72c9adb0a5e9787ef1ba7e5c2cb4abdbf6f5a6"

RPROVIDES:${PN} += "python38-curses python38-curses(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libncursesw.so.6()(64bit) libncursesw.so.6(NCURSESTW6_5.7.20081102)(64bit) libncursesw.so.6(NCURSESTW6_5.8.20110226)(64bit) libpanelw.so.6()(64bit) libpanelw.so.6(NCURSESTW6_5.7.20081102)(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit) python(abi) python38"

inherit rpm
