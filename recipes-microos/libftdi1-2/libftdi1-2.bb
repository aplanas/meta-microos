SUMMARY = "Library to program and control the FTDI USB controller"
DESCRIPTION = "Library to program and control the FTDI USB controller. \
This library is used by many programs accessing FTDI USB-to-RS232 converters."
LICENSE = "LGPL-2.1-only"

PV = "1.5.12+git.0684c1b"

RPM_NAME = "libftdi1-2-1.5.12+git.0684c1b-2.1.aarch64.rpm"
RPM_HASH = "96f71d7ec670e24a2188f5026db34ae621d8776878e02f0dfde4faf8b5a4c2e2312609fde1ba68c04c6cb78a069c6e81c867ef95b4d667eb28b14806310d2664"

RPROVIDES:${PN} += "libftdi1-2 libftdi1-2(aarch-64) libftdi1.so.2()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libusb-1.0.so.0()(64bit)"

inherit rpm
