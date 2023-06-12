SUMMARY = "S390x virtio-gpu ccw device for QEMU"
DESCRIPTION = "This package contains a module providing the s390x virtio gpu ccw device for \
QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-hw-s390x-virtio-gpu-ccw-8.0.2-1.1.aarch64.rpm"
RPM_HASH = "4f16ec7ee929a4d09ae888bb4e868826f09b2f0b3b572ce06331083155dbb1e33a5e5f8d80fb9ab6e8eb3e6d241e3eab40cbbce44c84095104c8e01c9c6552fc"

RPROVIDES:${PN} += "qemu-hw-s390x-virtio-gpu-ccw qemu-hw-s390x-virtio-gpu-ccw(aarch-64)"
RDEPENDS:${PN} += "qemu-hw-display-virtio-gpu"

inherit rpm
