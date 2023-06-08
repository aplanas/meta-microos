SUMMARY = "Header files for the Osmocom RANAP library"
DESCRIPTION = "Osmocom code for the Radio Access Network Application Part of the Iu-h \
interface. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libosmo-ranap."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-or-later"

PV = "1.3.0"

RPM_NAME = "libosmo-ranap-devel-1.3.0-1.3.aarch64.rpm"
RPM_HASH = "35ba516977db8884dda2fcfafaa70f8ece522677445f0ad58f01713a5ea29577cc5d368f411b3029a63eceb93da2f074b9233ffd1908fdac56316601d684d48a"

RPROVIDES:${PN} += "libosmo-ranap-devel libosmo-ranap-devel(aarch-64) pkgconfig(libosmo-ranap)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libosmo-ranap5"

inherit rpm
