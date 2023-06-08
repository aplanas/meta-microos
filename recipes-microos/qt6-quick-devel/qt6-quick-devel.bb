SUMMARY = "Qt 6 Quick library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-quick-devel-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "5a6ac4893c285a59511abb1145b2d4c4c51c2e0ba943ed8ff591cc72a1dfb60ecaf6e33c4a8a90f2f90deb12d1d566f2a3e2831a3d0af319ab6e607253325078"

RPROVIDES:${PN} += "cmake(Qt6Quick) pkgconfig(Qt6Quick) qt6-quick-devel qt6-quick-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Core) cmake(Qt6Gui) cmake(Qt6Network) cmake(Qt6OpenGL) cmake(Qt6Qml) cmake(Qt6QmlModels) libQt6Quick6 pkgconfig(Qt6Core) pkgconfig(Qt6Gui) pkgconfig(Qt6OpenGL) pkgconfig(Qt6Qml) pkgconfig(Qt6QmlModels)"

inherit rpm
