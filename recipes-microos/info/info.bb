SUMMARY = "A Stand-Alone Terminal-Based Info Browser"
DESCRIPTION = "Info is a terminal-based program for reading documentation of computer \
programs in the Info format. The GNU Project distributes most of its \
on-line manuals in the Info format, so you need a program called 'Info \
reader' to read the manuals."
LICENSE = "GPL-3.0-or-later"

PV = "7.0.3"

RPM_NAME = "info-7.0.3-1.1.aarch64.rpm"
RPM_HASH = "dbd65aa1768b954b1337eb25b0af5e8c83a7ffa9b0d54a37e9f86420fbb19ac62314f6b3f2f73bacc5ea00334b767acf39d7d8a26f66e9f194af99f1a992e032"

RPROVIDES:${PN} += "/sbin/install-info info info(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/gunzip /usr/bin/gzip ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) libzio.so.1()(64bit)"

inherit rpm
