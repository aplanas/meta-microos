SUMMARY = "Remote tape drive control server by GNU"
DESCRIPTION = "Provides remote access to files and devices for tar, cpio \
and similar backup utilities"
LICENSE = "GPL-3.0-or-later"

PV = "1.34"

RPM_NAME = "tar-rmt-1.34-10.3.aarch64.rpm"
RPM_HASH = "bc3d2980cd51a2ecc26d05bde9702d23eb39c812171f8ccb0914664c1292ec97df0adebde4144cc5c09dda4547da30e04846dd84a8c5ebdcf4b8b055b6b2add4"

RPROVIDES:${PN} += "rmt tar-rmt tar-rmt(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) update-alternatives"

inherit rpm
