SUMMARY = "Header files for the Osmocom E1 daemon protocol library"
DESCRIPTION = "This subpackage contains libraries and header files for developing \
applications that want to make use of libosmo-e1d."
LICENSE = "LGPL-3.0-or-later"

PV = "0.5.0"

RPM_NAME = "osmo-e1d-devel-0.5.0-1.1.aarch64.rpm"
RPM_HASH = "e596f5188043239f4164afbf3a2106b70490f11076edbc06b44f2b3b68ed6c679a32fd2016f30cdb4963c6b178e5b15782d43f120945829e3788abd584227e4a"

RPROVIDES:${PN} += "libosmo-e1d-devel \
osmo-e1d-devel \
osmo-e1d-devel(aarch-64) \
pkgconfig(libosmo-e1d) \
pkgconfig(libosmo-octoi)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libosmo-e1d1 \
libosmo-octoi1 \
pkgconfig(libosmocore)"

inherit rpm
