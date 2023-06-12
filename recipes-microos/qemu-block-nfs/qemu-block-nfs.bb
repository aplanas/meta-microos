SUMMARY = "direct Network File System support for QEMU"
DESCRIPTION = "This package contains a module for directly accessing nfs based image files \
for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-block-nfs-8.0.2-1.1.aarch64.rpm"
RPM_HASH = "15ef2c1ca5935dea878f66989c60685709b7330ed9a5ac503e5745f56edf727d1ed0a524e953c14d71977b321381c86865b21a30019be730d2a9944dc107cc39"

RPROVIDES:${PN} += "qemu-block-nfs qemu-block-nfs(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libnfs.so.14()(64bit)"

inherit rpm
