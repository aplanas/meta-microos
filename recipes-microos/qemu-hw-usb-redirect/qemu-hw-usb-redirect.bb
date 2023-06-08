SUMMARY = "USB redirection support for QEMU"
DESCRIPTION = "This package contains a module for USB redirection support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "7.1.0"

RPM_NAME = "qemu-hw-usb-redirect-7.1.0-16.1.aarch64.rpm"
RPM_HASH = "6c4a7a19293618b07fb13c8e7f7156d0a90bbed107819f6762cd7b0be8c3b51494bfbc989ded3b959a0c1362317a2c5e77f13b34803100da5c8db8044d5f7998"

RPROVIDES:${PN} += "qemu-hw-usb-redirect qemu-hw-usb-redirect(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libusbredirparser.so.1()(64bit) libusbredirparser.so.1(USBREDIRPARSER_0.8.0)(64bit)"

inherit rpm
