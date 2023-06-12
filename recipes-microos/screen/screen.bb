SUMMARY = "A program to allow multiple screens on a VT100/ANSI Terminal"
DESCRIPTION = "With this program you can take advantage of the multitasking abilities \
of your Linux system by opening several sessions over one terminal. The \
sessions can also be detached and resumed from another login terminal. \
 \
Documentation: man page"
LICENSE = "GPL-3.0-or-later"

PV = "4.9.0"

RPM_NAME = "screen-4.9.0-2.3.aarch64.rpm"
RPM_HASH = "11cd363368e7eb451509eb373887358305ab59ecdbc2ac68129cf55dd47159c9632b36a81295027d36de50aa946ea464b5938e8455aee64260defbee9f1050b9"

RPROVIDES:${PN} += "config(screen) \
screen \
screen(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypt.so.1()(64bit) \
libcrypt.so.1(XCRYPT_2.0)(64bit) \
libpam.so.0()(64bit) \
libpam.so.0(LIBPAM_1.0)(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libutempter.so.0()(64bit) \
permissions \
terminfo-base"

inherit rpm
