SUMMARY = "S390x virtio-gpu ccw device for QEMU"
DESCRIPTION = "This package contains a module providing the s390x virtio gpu ccw device for \
QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "7.1.0"

RPM_NAME = "qemu-hw-s390x-virtio-gpu-ccw-7.1.0-16.1.aarch64.rpm"
RPM_HASH = "ec0448b9585d4a117f137b0fa122f0d1a26e4a34f2a342869e75008ff8fe3475bbe7ad79c57789bd7148785f58aae5dafa6cdbe30377229cfa38f96f09933414"

RPROVIDES:${PN} += "qemu-hw-s390x-virtio-gpu-ccw qemu-hw-s390x-virtio-gpu-ccw(aarch-64)"
RDEPENDS:${PN} += "qemu-hw-display-virtio-gpu"

inherit rpm
