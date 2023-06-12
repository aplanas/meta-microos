SUMMARY = "OpenGL based UI support for QEMU"
DESCRIPTION = "This package contains a module for doing OpenGL based UI for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-ui-opengl-8.0.2-1.1.aarch64.rpm"
RPM_HASH = "41c75d007a8ee5f5653d7fecdec29f3b73fe2cd68a57936e6a97bc9ff3a6495636ad7c85e627347bde419c07d69fee3968ccdcde29fdff978f5dcfde8eb6421d"

RPROVIDES:${PN} += "qemu-ui-opengl qemu-ui-opengl(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libepoxy.so.0()(64bit) libgbm.so.1()(64bit) libpixman-1.so.0()(64bit)"

inherit rpm
