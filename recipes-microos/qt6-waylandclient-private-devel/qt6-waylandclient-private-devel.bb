SUMMARY = "Non-ABI stable API for the Qt 6 WaylandClient library"
DESCRIPTION = "This package provides private headers of libQt6WaylandClient that do not have \
any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-waylandclient-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "6528b18a5a4c92d2df2cff1a5720758e8ba09fc96322d6d9f74b7c0f0e905be80787f8069bb0d6bf311b3a0d53446c1eb8f17f15cbaab989917bea60764b5c0c"

RPROVIDES:${PN} += "qt6-waylandclient-private-devel qt6-waylandclient-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6WaylandClient)"

inherit rpm
