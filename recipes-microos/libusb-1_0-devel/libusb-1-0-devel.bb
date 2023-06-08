SUMMARY = "USB Library"
DESCRIPTION = "Libusb is a library that allows userspace access to USB devices."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.26"

RPM_NAME = "libusb-1_0-devel-1.0.26-1.5.aarch64.rpm"
RPM_HASH = "10ba6c3208ed13e0b75d398dc33915f1565820467b0f91e38fdcf1b0f9e228873a7ee2d0b912ef3de9fd5eca578831400318c664465e9298937aaf786dbe532f"

RPROVIDES:${PN} += "libusb-1_0-devel libusb-1_0-devel(aarch-64) pkgconfig(libusb-1.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config glibc-devel libusb-1_0-0"

inherit rpm
