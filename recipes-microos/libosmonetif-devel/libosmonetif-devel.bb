SUMMARY = "Development files for the Osmocom muxed audio library"
DESCRIPTION = "Network interface demuxer library for OsmoCom projects. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libosmo-netif."
LICENSE = "AGPL-3.0-or-later"

PV = "1.2.0"

RPM_NAME = "libosmonetif-devel-1.2.0-1.5.aarch64.rpm"
RPM_HASH = "ae89a3fa909c22b1943cf4cdc101a9bbe912633093e5203f1fe5a58c7f44ac9f1c61c4ef1a6f7bbf1899d2d9465b25d9b08eedb223fd552631effca22b9677d9"

RPROVIDES:${PN} += "libosmonetif-devel libosmonetif-devel(aarch-64) pkgconfig(libosmo-netif)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libosmonetif8"

inherit rpm
