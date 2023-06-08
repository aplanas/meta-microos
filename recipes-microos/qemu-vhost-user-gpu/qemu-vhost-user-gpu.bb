SUMMARY = "Vhost user mode virtio-gpu 2D/3D rendering backend for QEMU"
DESCRIPTION = "This package contains a vhost user mode virtio-gpu 2D/3D rendering backend for \
QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "7.1.0"

RPM_NAME = "qemu-vhost-user-gpu-7.1.0-16.1.aarch64.rpm"
RPM_HASH = "1b95eecf7b3702f236b1b5d507772771ed0e3d87824e0bbaebfe74f8231ab6398c917c70d32f606b60832d6910c4bb2266fe720728b10acd1b5d24446d01ae91"

RPROVIDES:${PN} += "qemu-vhost-user-gpu qemu-vhost-user-gpu(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libepoxy.so.0()(64bit) libgbm.so.1()(64bit) libglib-2.0.so.0()(64bit) libgmodule-2.0.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libpixman-1.so.0()(64bit) libvirglrenderer.so.1()(64bit)"

inherit rpm
