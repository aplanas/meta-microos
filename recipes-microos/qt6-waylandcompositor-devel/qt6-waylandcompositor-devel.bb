SUMMARY = "Development files for the Qt6 WaylandCompositor library"
DESCRIPTION = "Development files for the Qt6 WaylandCompositor library."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-waylandcompositor-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "3b02ad42af409beba5aeb458c109e2b36685724a7c1a2be0b02b6c5015cdc2e87b2d5bc6cdbbb1331ee0d2e1359b57c62ef3b0c2f279f18c1057fe2c7679bff1"

RPROVIDES:${PN} += "cmake(Qt6WaylandCompositor) \
pkgconfig(Qt6WaylandCompositor) \
qt6-waylandcompositor-devel \
qt6-waylandcompositor-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake(Qt6Gui) \
cmake(Qt6OpenGL) \
cmake(Qt6Qml) \
cmake(Qt6Quick) \
cmake(Qt6WaylandGlobalPrivate) \
libQt6WaylandCompositor6 \
pkgconfig(Qt6Core) \
pkgconfig(Qt6Gui) \
pkgconfig(Qt6OpenGL) \
pkgconfig(Qt6Qml) \
pkgconfig(Qt6Quick)"

inherit rpm
