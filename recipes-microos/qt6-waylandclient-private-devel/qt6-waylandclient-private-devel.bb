SUMMARY = "Non-ABI stable API for the Qt 6 WaylandClient library"
DESCRIPTION = "This package provides private headers of libQt6WaylandClient that do not have \
any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-waylandclient-private-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "b8dff7eb086011653d45809699a71001b31025906eb9fd20aaa0b75aa114cda754d6adefecaf6d293d3b38fee500fc61de1611063e61db370f7cb0f7ac91a701"

RPROVIDES:${PN} += "qt6-waylandclient-private-devel qt6-waylandclient-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6WaylandClient)"

inherit rpm
