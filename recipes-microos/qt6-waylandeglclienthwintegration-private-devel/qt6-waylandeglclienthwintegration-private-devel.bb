SUMMARY = "Qt 6 WaylandEglClientHwIntegration library - Development files"
DESCRIPTION = "Development files for the Qt 6 WaylandEglClientHwIntegration library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-waylandeglclienthwintegration-private-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "5c38bdfd38343808b60cee16948f44c0895d4d02a79de5c1975e0f8fac9e8f44e509ba962bf57dbac98159bd95f8968b58a287812e9519fce16965bfaec84ba6"

RPROVIDES:${PN} += "cmake(Qt6WaylandEglClientHwIntegrationPrivate) qt6-waylandeglclienthwintegration-private-devel qt6-waylandeglclienthwintegration-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6Gui) libQt6WaylandEglClientHwIntegration6 qt6-opengl-private-devel qt6-waylandclient-private-devel"

inherit rpm
