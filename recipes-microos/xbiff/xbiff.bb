SUMMARY = "Utility to monitor a mailbox"
DESCRIPTION = "xbiff provides graphical notification of new e-mail. \
It only handles mail stored in a filesystem accessible file, \
not via IMAP, POP or other remote access protocols."
LICENSE = "MIT"

PV = "1.0.4"

RPM_NAME = "xbiff-1.0.4-2.7.aarch64.rpm"
RPM_HASH = "1ef30350cd2a6d8222b3bcb4597a26f81024cac2b769bc7e5d0331016c75b8df9d6e6953e1c5b2a7dc02eb5cbb7e08e8da4fea24b80da476083010e70c2d3357"

RPROVIDES:${PN} += "xbiff xbiff(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXaw.so.7()(64bit) libXext.so.6()(64bit) libXmu.so.6()(64bit) libXt.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
