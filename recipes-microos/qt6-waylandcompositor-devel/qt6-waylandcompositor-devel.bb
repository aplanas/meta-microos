SUMMARY = "Development files for the Qt6 WaylandCompositor library"
DESCRIPTION = "Development files for the Qt6 WaylandCompositor library."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-waylandcompositor-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "28ccb76b32aeff7e454bbd3d08269c80ba73fe74fc71d5634449e97fba7d0b89cf578be92dcb40a228ca24448767240879095e323a0f3c1a57d6a63e842809dc"

RPROVIDES:${PN} += "cmake(Qt6WaylandCompositor) pkgconfig(Qt6WaylandCompositor) qt6-waylandcompositor-devel qt6-waylandcompositor-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Gui) cmake(Qt6OpenGL) cmake(Qt6Qml) cmake(Qt6Quick) cmake(Qt6WaylandGlobalPrivate) libQt6WaylandCompositor6 pkgconfig(Qt6Core) pkgconfig(Qt6Gui) pkgconfig(Qt6OpenGL) pkgconfig(Qt6Qml) pkgconfig(Qt6Quick)"

inherit rpm
