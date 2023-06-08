SUMMARY = "Development files for the Osmocom M2UA library"
DESCRIPTION = "M2UA provides an SCTP adaptation layer for MTP level 2 user messages \
and service interface across an IP network. \
 \
This subpackage contains the development files for the Osmocom M2UA \
library."
LICENSE = "GPL-2.0-or-later"

PV = "1.6.0"

RPM_NAME = "libosmo-xua-devel-1.6.0-1.4.aarch64.rpm"
RPM_HASH = "3810b4098a0a893fcf309178b2a909a6ec284d25f1396aa551d75b4f8385690b09918ce0da1fb4db1673674e59395fbee69517cabf1060345c0ee8e522b8b05c"

RPROVIDES:${PN} += "libosmo-xua-devel libosmo-xua-devel(aarch-64) pkgconfig(libosmo-xua)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libosmo-sigtran-devel libosmo-xua-1_6_0"

inherit rpm
