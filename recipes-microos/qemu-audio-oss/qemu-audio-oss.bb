SUMMARY = "OSS based audio support for QEMU"
DESCRIPTION = "This package contains a module for OSS based audio support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-audio-oss-8.0.2-1.1.aarch64.rpm"
RPM_HASH = "a0ea3634767d9fce086c3cd16d9d7cd03e3190066e649a1cef4ca67f6c19e3d6d3f258e65a37e557693d6cbae0f7e2fec6bf3a4ef97bf3ae0a67910961f09062"

RPROVIDES:${PN} += "qemu-audio-oss \
qemu-audio-oss(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
