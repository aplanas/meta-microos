SUMMARY = "Development files for Osmocom's Media Gateway Control Protocol client library"
DESCRIPTION = "Osmocom's Media Gateway Control Protocol client librarary. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libosmo-mgcp-client."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-or-later"

PV = "1.9.0"

RPM_NAME = "libosmo-mgcp-client-devel-1.9.0-1.10.aarch64.rpm"
RPM_HASH = "31c5d9672e5ee3ab551da3aa442c03ed759622c2d0732ab70feabad065c76e90071b876bbf3e232cb1101f0b7c258728cd9863c1acec07a916d630cdf3ea3d08"

RPROVIDES:${PN} += "libosmo-mgcp-client-devel \
libosmo-mgcp-client-devel(aarch-64) \
pkgconfig(libosmo-mgcp-client)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libosmo-mgcp-client9"

inherit rpm
