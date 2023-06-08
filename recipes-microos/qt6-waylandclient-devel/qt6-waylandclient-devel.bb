SUMMARY = "Development files for the Qt 6 WaylandClient library"
DESCRIPTION = "Development files for the Qt6 WaylandClient library."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-waylandclient-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "8c798196e19c6632b66e39d8b0542198c2d27664053f124f75683786343396b8d96f66f69ee77c17a253561de9d37bfa0f24aae271be0df291e1ee16d2385152"

RPROVIDES:${PN} += "cmake(Qt6WaylandClient) cmake(Qt6WaylandScannerTools) pkgconfig(Qt6WaylandClient) qt6-waylandclient-devel qt6-waylandclient-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Gui) cmake(Qt6WaylandGlobalPrivate) libQt6WaylandClient6 pkgconfig(Qt6Core) pkgconfig(Qt6Gui) qt6-wayland"

inherit rpm
