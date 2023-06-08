SUMMARY = "Virtio GPU display support for QEMU"
DESCRIPTION = "This package contains a module for Virtio GPU display support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "7.1.0"

RPM_NAME = "qemu-hw-display-virtio-gpu-7.1.0-16.1.aarch64.rpm"
RPM_HASH = "73db1643df2761b6f2842789c1d05dcbc3205a0cf96e2b8fdc37a3c2e85368aea1762277bf2db865921c26a236da74cad64fae63fe70a65c33281c77f2ec75dc"

RPROVIDES:${PN} += "qemu-hw-display-virtio-gpu qemu-hw-display-virtio-gpu(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.28)(64bit) libpixman-1.so.0()(64bit) libvirglrenderer.so.1()(64bit)"

inherit rpm
