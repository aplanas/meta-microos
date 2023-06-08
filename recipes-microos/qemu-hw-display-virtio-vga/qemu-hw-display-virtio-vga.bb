SUMMARY = "Virtio vga device for QEMU"
DESCRIPTION = "This package contains a module providing the virtio vga device for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "7.1.0"

RPM_NAME = "qemu-hw-display-virtio-vga-7.1.0-16.1.aarch64.rpm"
RPM_HASH = "90115c0469da218debcb17c9826a49d785b13b903f6ed725a694c2f93eae9820c8cd6e3b16d3faa517f9c3a58c20b90e629c5207c8f740feef6086bfc5c2c61d"

RPROVIDES:${PN} += "qemu-hw-display-virtio-vga qemu-hw-display-virtio-vga(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
