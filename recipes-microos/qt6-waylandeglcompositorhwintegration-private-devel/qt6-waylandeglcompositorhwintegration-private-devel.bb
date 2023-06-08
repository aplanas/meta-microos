SUMMARY = "Qt 6 WaylandEglCompositorHwIntegration library - Development files"
DESCRIPTION = "Development files for the Qt 6 WaylandEglCompositorHwIntegration library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-waylandeglcompositorhwintegration-private-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "8707229b1caea082c9f8d7358acf78fb9ecab60944eefc992bc71a6e7169a86dd8a55e522d77a8e76943595e5859f8315492a523963811e86352eb466172f041"

RPROVIDES:${PN} += "cmake(Qt6WaylandEglCompositorHwIntegrationPrivate) qt6-waylandeglcompositorhwintegration-private-devel qt6-waylandeglcompositorhwintegration-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6Gui) libQt6WaylandEglCompositorHwIntegration6 qt6-waylandcompositor-private-devel"

inherit rpm
