SUMMARY = "Qt 6 Quick3DPhysics library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3DPhysics library."
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "qt6-quick3dphysics-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "2fd229ee1ee0c9e61b2878bdb07f4fd3bcf5c46b91e5403c765b70325be93362ce70ff2dcc6a4acb897a934cb83cd4996ac1526594a7333a6a6f2207cb1609f3"

RPROVIDES:${PN} += "cmake(Qt6Quick3DPhysics) pkgconfig(Qt6Quick3DPhysics) qt6-quick3dphysics-devel qt6-quick3dphysics-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Gui) cmake(Qt6Qml) cmake(Qt6Quick) cmake(Qt6Quick3D) libQt6Quick3DPhysics6 pkgconfig(Qt6Core) pkgconfig(Qt6Gui) pkgconfig(Qt6Qml) pkgconfig(Qt6Quick) pkgconfig(Qt6Quick3D)"

inherit rpm
