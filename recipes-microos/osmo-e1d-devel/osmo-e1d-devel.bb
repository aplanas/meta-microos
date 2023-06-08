SUMMARY = "Header files for the Osmocom E1 daemon protocol library"
DESCRIPTION = "This subpackage contains libraries and header files for developing \
applications that want to make use of libosmo-e1d."
LICENSE = "LGPL-3.0-or-later"

PV = "0.4.0"

RPM_NAME = "osmo-e1d-devel-0.4.0-1.4.aarch64.rpm"
RPM_HASH = "b19c6a89650fad68d057289d5fb758e4b36bf81711af853101ec777793b2162d5d7f977241717d8240840fda760f5c42f60fcf7ca2ec3c39de764887f5059ce0"

RPROVIDES:${PN} += "libosmo-e1d-devel osmo-e1d-devel osmo-e1d-devel(aarch-64) pkgconfig(libosmo-e1d) pkgconfig(libosmo-octoi)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libosmo-e1d1 libosmo-octoi0 pkgconfig(libosmocore)"

inherit rpm
