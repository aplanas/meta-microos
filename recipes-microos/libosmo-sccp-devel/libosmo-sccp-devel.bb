SUMMARY = "Development files for the Osmocom SCCP library"
DESCRIPTION = "SCCP is a network layer protocol that provides routing, flow control, \
segmentation, connection-orientation, and error correction facilities \
in SS7 telecommunications networks. \
 \
This subpackage contains the development files for the Osmocom SCCP \
library."
LICENSE = "GPL-2.0-or-later"

PV = "1.6.0"

RPM_NAME = "libosmo-sccp-devel-1.6.0-1.4.aarch64.rpm"
RPM_HASH = "d1fb5c2393a5c0d79ddab5d556b9397ca69da06eca238321eb5d1bcfbfaf2fea31ac98b7096cfa90f5b806baacfe48d0c4685ae8126e920d063aada34424ab92"

RPROVIDES:${PN} += "libosmo-sccp-devel libosmo-sccp-devel(aarch-64) pkgconfig(libosmo-sccp)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libosmo-sccp-1_6_0"

inherit rpm
