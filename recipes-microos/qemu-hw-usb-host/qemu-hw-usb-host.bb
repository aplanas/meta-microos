SUMMARY = "USB passthrough driver support for QEMU"
DESCRIPTION = "This package contains a modules for USB passthrough driver for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-hw-usb-host-8.0.2-1.1.aarch64.rpm"
RPM_HASH = "a567ac4056df6fc44c3ab2a9fe4d808e063c04bd16224a437e39b5d8bc6700b5cd5bdc41858cab5d2d8022afd414bbca3c6c9ba95e5be2fb244036f295fe820c"

RPROVIDES:${PN} += "qemu-hw-usb-host qemu-hw-usb-host(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libusb-1.0.so.0()(64bit)"

inherit rpm
