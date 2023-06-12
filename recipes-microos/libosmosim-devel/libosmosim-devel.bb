SUMMARY = "Development files for the Osmocom SIM card utility library"
DESCRIPTION = "The libosmosim library in particular contains routines for SIM card \
access. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libosmosim."
LICENSE = "GPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "libosmosim-devel-1.8.0-1.1.aarch64.rpm"
RPM_HASH = "5d9de7b72f13e466d5547bd256549e6fc2a2fe9c77eca9d64c0e7bb06fdf45edb64023c6cf2c1a45eca39ceff9080eb6b68b889755b3b2fe876bb31b075eb743"

RPROVIDES:${PN} += "libosmosim-devel \
libosmosim-devel(aarch-64) \
pkgconfig(libosmosim)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libosmocore-devel \
libosmosim2 \
pkgconfig(libosmocore) \
pkgconfig(talloc)"

inherit rpm
