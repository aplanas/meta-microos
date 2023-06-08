SUMMARY = "direct Network File System support for QEMU"
DESCRIPTION = "This package contains a module for directly accessing nfs based image files \
for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "7.1.0"

RPM_NAME = "qemu-block-nfs-7.1.0-16.1.aarch64.rpm"
RPM_HASH = "cf10668deff41b29bf970f0e7aa4e32c8f6bc237ea00a847be8e849976a2328e375d76383d3b24a538ef88f4258709ed47f8694ff4bfc65d6d5eed6d682cbaba"

RPROVIDES:${PN} += "qemu-block-nfs qemu-block-nfs(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libnfs.so.14()(64bit)"

inherit rpm
