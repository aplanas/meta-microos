SUMMARY = "Development files for the Osmocom USB library"
DESCRIPTION = "The libosmosub library in particular contains routines for USB device \
access via libusb-1.0, integrated into the libosmocore select event loop. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libosmousb."
LICENSE = "GPL-2.0-or-later"

PV = "1.7.0"

RPM_NAME = "libosmousb-devel-1.7.0-2.4.aarch64.rpm"
RPM_HASH = "5e5fc5e0dda105162fbbc1a1038faaabae4fd4f1d8c4d7083c196e9eea5a39dee30455522b5e3aa2034424dd3dcd4d8eb78a72c2dde5106b80ba722216eff78b"

RPROVIDES:${PN} += "libosmousb-devel libosmousb-devel(aarch-64) pkgconfig(libosmousb)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libosmocore-devel libosmousb0 libusb-1_0-devel pkgconfig(libosmocore) pkgconfig(libusb-1.0) pkgconfig(talloc)"

inherit rpm
