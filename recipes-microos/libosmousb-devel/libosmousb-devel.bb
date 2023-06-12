SUMMARY = "Development files for the Osmocom USB library"
DESCRIPTION = "The libosmosub library in particular contains routines for USB device \
access via libusb-1.0, integrated into the libosmocore select event loop. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libosmousb."
LICENSE = "GPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "libosmousb-devel-1.8.0-1.1.aarch64.rpm"
RPM_HASH = "699abdf531aaf964995161175f519c4d09f6efa50a6d3e186ac01bc0554cac4636a65e540c3e32aed3260807a369cae3f338482d3eeb048b967dd0235e354ca5"

RPROVIDES:${PN} += "libosmousb-devel libosmousb-devel(aarch-64) pkgconfig(libosmousb)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libosmocore-devel libosmousb0 libusb-1_0-devel pkgconfig(libosmocore) pkgconfig(libusb-1.0) pkgconfig(talloc)"

inherit rpm
