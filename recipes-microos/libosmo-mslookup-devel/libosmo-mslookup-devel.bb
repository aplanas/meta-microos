SUMMARY = "Development files for the Osmocom MS lookup library"
DESCRIPTION = "This shared library contains routines for looking up mobile subscribers. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libosmo-mslookup."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.0"

RPM_NAME = "libosmo-mslookup-devel-1.4.0-1.11.aarch64.rpm"
RPM_HASH = "e495b0cd605e67ad84b1d21b21450b88e32e6c687ece1c065c3a1899b4f85dbab227a4281bf459f3e1e219fc7aa824bf85886841c0be49412d539fe372f54bfb"

RPROVIDES:${PN} += "libosmo-mslookup-devel libosmo-mslookup-devel(aarch-64) pkgconfig(libosmo-mslookup)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libosmo-mslookup0"

inherit rpm
