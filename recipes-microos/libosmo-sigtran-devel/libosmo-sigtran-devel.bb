SUMMARY = "Development files for the Osmocom sigtran library"
DESCRIPTION = "Osmocom implementation of (parts of) SIGTRAN. \
 \
This subpackage contains the development files for the Osmocom \
SIGTRAN library."
LICENSE = "GPL-2.0-or-later"

PV = "1.7.0"

RPM_NAME = "libosmo-sigtran-devel-1.7.0-1.1.aarch64.rpm"
RPM_HASH = "54bbd5dbc0502d052e124738263d2fb634c41de047f8e0dd7523d78840b00e9118f892aed7a358bb0b1f6cc2b5644d5632a8e44d51b939dbd6847e51e9aecd96"

RPROVIDES:${PN} += "libosmo-sigtran-devel libosmo-sigtran-devel(aarch-64) pkgconfig(libosmo-sigtran)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libosmo-sigtran7"

inherit rpm
