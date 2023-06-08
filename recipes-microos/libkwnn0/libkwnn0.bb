SUMMARY = "FreeWnn Korean Input System library"
DESCRIPTION = "This subpackage contains a core library of the Wnn input system."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.1a023.1"

RPM_NAME = "libkwnn0-1.1.1a023.1-4.3.aarch64.rpm"
RPM_HASH = "7ec0dd1c821a9ba5bd236794a7ee1200ddbf6cd0200c04baa050077c51c5de60da51a2e13ae0586245e4e55529b1ec988e40181d27f1847bebe81d4cdb820182"

RPROVIDES:${PN} += "libkwnn.so.0()(64bit) libkwnn0 libkwnn0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libcrypt.so.1()(64bit) libcrypt.so.1(XCRYPT_2.0)(64bit)"

inherit rpm
