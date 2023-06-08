SUMMARY = "Baum braille chardev support for QEMU"
DESCRIPTION = "This package contains a module for baum braille chardev support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "7.1.0"

RPM_NAME = "qemu-chardev-baum-7.1.0-16.1.aarch64.rpm"
RPM_HASH = "72984059e598d2c91ec1d2754b61d257bc06b6de8689d287e98d8a7101ad18295e21f7606d68929706e63777480dd9ee0704f668c182c5f227339a9ae7e06621"

RPROVIDES:${PN} += "qemu-chardev-baum qemu-chardev-baum(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbrlapi.so.0.8()(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
