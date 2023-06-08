SUMMARY = "Python Interface to the (N)Curses Library"
DESCRIPTION = "An easy to use interface to the (n)curses CUI library. CUI stands for \
Console User Interface."
LICENSE = "Python-2.0"

PV = "2.7.18"

RPM_NAME = "python-curses-2.7.18-33.1.aarch64.rpm"
RPM_HASH = "caf3c24aa04a403537ef4397c97880dda703d7b4e45e3666df62311fac6cb60d8dbb7122b0e903e1b3148e9cdaaad4c8083323e216adb421fdb512b56487250e"

RPROVIDES:${PN} += "pyth_cur python-curses python-curses(aarch-64) python2-curses"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libncursesw.so.6()(64bit) libncursesw.so.6(NCURSESTW6_5.7.20081102)(64bit) libncursesw.so.6(NCURSESTW6_5.8.20110226)(64bit) libpanelw.so.6()(64bit) libpanelw.so.6(NCURSESTW6_5.7.20081102)(64bit) libpython2.7.so.1.0()(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit) python-base"

inherit rpm
