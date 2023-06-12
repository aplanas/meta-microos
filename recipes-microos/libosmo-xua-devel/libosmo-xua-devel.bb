SUMMARY = "Development files for the Osmocom M2UA library"
DESCRIPTION = "M2UA provides an SCTP adaptation layer for MTP level 2 user messages \
and service interface across an IP network. \
 \
This subpackage contains the development files for the Osmocom M2UA \
library."
LICENSE = "GPL-2.0-or-later"

PV = "1.7.0"

RPM_NAME = "libosmo-xua-devel-1.7.0-1.1.aarch64.rpm"
RPM_HASH = "a3f53f4c4f24869f2e4957e7ded5e0bdc10ee46a9786ea18b3d0bc4828fee65fddfd59b03978e88eb9c2685c6c20ae0dfc5c80f5210b965f386906719b2ee525"

RPROVIDES:${PN} += "libosmo-xua-devel libosmo-xua-devel(aarch-64) pkgconfig(libosmo-xua)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libosmo-sigtran-devel libosmo-xua-1_7_0"

inherit rpm
