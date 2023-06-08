SUMMARY = "FreeWnn Japanese Input System library"
DESCRIPTION = "This subpackage contains a core library of the Wnn input system."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.1a023.1"

RPM_NAME = "libjd0-1.1.1a023.1-4.3.aarch64.rpm"
RPM_HASH = "d7d6ca9532767b2ae78c9f5f1e357980f6d54ea6509e86a0e08016b5eff8becca9b2b0b445d4ccf56949d971a310112b62ae1664d66d6320966ba1a6f90859b6"

RPROVIDES:${PN} += "libjd.so.0()(64bit) libjd0 libjd0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libcrypt.so.1()(64bit) libcrypt.so.1(XCRYPT_2.0)(64bit)"

inherit rpm
