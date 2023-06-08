SUMMARY = "Curses based UI support for QEMU"
DESCRIPTION = "This package contains a module for doing curses based UI for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "7.1.0"

RPM_NAME = "qemu-ui-curses-7.1.0-16.1.aarch64.rpm"
RPM_HASH = "ce54a559d8dbb4bd0a5d70a85bd5ae2bf61bfac3a6709ccfd44a300951be839c151e22b30fc8ef05add0ce2221ba7ba1ed435dccc7ea51aeee153b9e145d08d7"

RPROVIDES:${PN} += "qemu-ui-curses qemu-ui-curses(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libglib-2.0.so.0()(64bit) libncursesw.so.6()(64bit) libncursesw.so.6(NCURSESTW6_5.7.20081102)(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit)"

inherit rpm
