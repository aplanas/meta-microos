SUMMARY = "Rados Block Device (Ceph) support for QEMU"
DESCRIPTION = "This package contains a module for accessing ceph (rbd,rados) image files \
for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "7.1.0"

RPM_NAME = "qemu-block-rbd-7.1.0-16.1.aarch64.rpm"
RPM_HASH = "08fd9089c385b11bc3b846efdee203ac5497cff78b6ed09cf6c43ee2bad4dc6245f46239d320b18bd74b9fbefa21be8cf413494ff83a271ecbc1ce65336f2da8"

RPROVIDES:${PN} += "qemu-block-rbd qemu-block-rbd(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) librados.so.2()(64bit) librbd.so.1()(64bit)"

inherit rpm
