SUMMARY = "Menus and Input Boxes for Shell Scripts"
DESCRIPTION = "This program lets you use menus and dialog boxes in shell scripts."
LICENSE = "LGPL-2.1-only"

PV = "1.3"

RPM_NAME = "libdialog15-1.3-9.7.aarch64.rpm"
RPM_HASH = "a606d2546a4c2ee64466eaf267d513998a4f3e571e3292c6a0336d729f40671994dcc1324a4b07273e1b27ce8399cd03aebe66424df1c09d33f343e3f965faed"

RPROVIDES:${PN} += "libdialog.so.15()(64bit) libdialog15 libdialog15(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libncursesw.so.6()(64bit) libncursesw.so.6(NCURSESTW6_5.7.20081102)(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit)"

inherit rpm
