SUMMARY = "USB smartcard support for QEMU"
DESCRIPTION = "This package contains a modules for USB smartcard support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "7.1.0"

RPM_NAME = "qemu-hw-usb-smartcard-7.1.0-16.1.aarch64.rpm"
RPM_HASH = "11dbc567735e055f7efc70fb79ccc8f9c8fe06f04015ed311ef25780abb72feb1fe44069aa7b43105b984271946e270824e9b89fc311bad48fec93edf646db7b"

RPROVIDES:${PN} += "qemu-hw-usb-smartcard qemu-hw-usb-smartcard(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcacard.so.0()(64bit) libglib-2.0.so.0()(64bit)"

inherit rpm
