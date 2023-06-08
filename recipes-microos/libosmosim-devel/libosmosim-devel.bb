SUMMARY = "Development files for the Osmocom SIM card utility library"
DESCRIPTION = "The libosmosim library in particular contains routines for SIM card \
access. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libosmosim."
LICENSE = "GPL-2.0-or-later"

PV = "1.7.0"

RPM_NAME = "libosmosim-devel-1.7.0-2.4.aarch64.rpm"
RPM_HASH = "7f08b04c9e245a0c7be511df7dfabca6f4c5c1bcc0ca5dfb8dff9fb9e5c4dc6b4b1436a6bb62fc7d87883657ae609e9beaef682b0d3d0484a71035c024688205"

RPROVIDES:${PN} += "libosmosim-devel libosmosim-devel(aarch-64) pkgconfig(libosmosim)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libosmocore-devel libosmosim2 pkgconfig(libosmocore) pkgconfig(talloc)"

inherit rpm
