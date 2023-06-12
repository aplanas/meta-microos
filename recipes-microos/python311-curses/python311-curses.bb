SUMMARY = "Python Interface to the (N)Curses Library"
DESCRIPTION = "An easy to use interface to the (n)curses CUI library. CUI stands for \
Console User Interface."
LICENSE = "Python-2.0"

PV = "3.11.3"

RPM_NAME = "python311-curses-3.11.3-1.1.aarch64.rpm"
RPM_HASH = "3fe6aef0c746a4ce586fdcbb3a6dc347f888ff3cd74c9fc5db51783ed0a55cbabe693252a97f603e0c462ab80fa9ddacfc03b25756961f862eb44b485ba8be11"

RPROVIDES:${PN} += "python311-curses python311-curses(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libncursesw.so.6()(64bit) libncursesw.so.6(NCURSESTW6_5.7.20081102)(64bit) libncursesw.so.6(NCURSESTW6_5.8.20110226)(64bit) libncursesw.so.6(NCURSESTW6_6.1.20171230)(64bit) libpanelw.so.6()(64bit) libpanelw.so.6(NCURSESTW6_5.7.20081102)(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit) python(abi) python311"

inherit rpm
