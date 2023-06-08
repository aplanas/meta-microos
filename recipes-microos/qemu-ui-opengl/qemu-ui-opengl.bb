SUMMARY = "OpenGL based UI support for QEMU"
DESCRIPTION = "This package contains a module for doing OpenGL based UI for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "7.1.0"

RPM_NAME = "qemu-ui-opengl-7.1.0-16.1.aarch64.rpm"
RPM_HASH = "8b1f2b4618f1b36f05e0ea1d51a0a52da74cdb390acbd37cf06272b7c0683d1eb6e89bcf5c5d0b49084860701919644a2027bcd6f7c0272318704a4a889f4ba7"

RPROVIDES:${PN} += "qemu-ui-opengl qemu-ui-opengl(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libepoxy.so.0()(64bit) libgbm.so.1()(64bit) libpixman-1.so.0()(64bit)"

inherit rpm
