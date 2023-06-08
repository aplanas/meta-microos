SUMMARY = "Virtio-gpu pci device for QEMU"
DESCRIPTION = "This package contains a module providing the virtio gpu pci device for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "7.1.0"

RPM_NAME = "qemu-hw-display-virtio-gpu-pci-7.1.0-16.1.aarch64.rpm"
RPM_HASH = "a9ce3d971029039f8e3cbebb456fd48a1e2586dc1e8fe71a31c3ae58898d5caf8abf3281742c5a4bb2caf1254b3100e44d6f313257b2a10211406a9667c67774"

RPROVIDES:${PN} += "qemu-hw-display-virtio-gpu-pci qemu-hw-display-virtio-gpu-pci(aarch-64)"
RDEPENDS:${PN} += "qemu-hw-display-virtio-gpu"

inherit rpm
