SUMMARY = "Qt 6 Quick3DPhysics library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3DPhysics library."
LICENSE = "GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-quick3dphysics-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "0d41627465bc4503cca28190b654be1e02c2b23b2dcaaaf94bdbd6a37894f62fd9ffec344ee01aa0f218b7b07923bd564487924eb2e91526918993e287ae6ce2"

RPROVIDES:${PN} += "cmake(Qt6Quick3DPhysics) pkgconfig(Qt6Quick3DPhysics) qt6-quick3dphysics-devel qt6-quick3dphysics-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Gui) cmake(Qt6Qml) cmake(Qt6Quick) cmake(Qt6Quick3D) libQt6Quick3DPhysics6 pkgconfig(Qt6Core) pkgconfig(Qt6Gui) pkgconfig(Qt6Qml) pkgconfig(Qt6Quick) pkgconfig(Qt6Quick3D)"

inherit rpm
