SUMMARY = "Qt 6 WaylandEglClientHwIntegration library - Development files"
DESCRIPTION = "Development files for the Qt 6 WaylandEglClientHwIntegration library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-waylandeglclienthwintegration-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "9afbf7b2b03ec5d0a0b3b9069fe17df93b6f20e68d0189f5eb057cfa2c4777f6cbba19e4b7a7c316450e7b7b2f875d21e858530bd9a295fa81b2fca36bcac292"

RPROVIDES:${PN} += "cmake(Qt6WaylandEglClientHwIntegrationPrivate) qt6-waylandeglclienthwintegration-private-devel qt6-waylandeglclienthwintegration-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6Gui) libQt6WaylandEglClientHwIntegration6 qt6-opengl-private-devel qt6-waylandclient-private-devel"

inherit rpm
