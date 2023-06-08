SUMMARY = "USB passthrough driver support for QEMU"
DESCRIPTION = "This package contains a modules for USB passthrough driver for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "7.1.0"

RPM_NAME = "qemu-hw-usb-host-7.1.0-16.1.aarch64.rpm"
RPM_HASH = "e3254f1ea0c90f3ec14daf799fa4fd2400e47873f39ad91c3af8902d916723e1c3bc8e18140f8df0f56f4a36d6e3b0947205e5c4d00d98548c70bfb8fa028516"

RPROVIDES:${PN} += "qemu-hw-usb-host qemu-hw-usb-host(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libusb-1.0.so.0()(64bit)"

inherit rpm
