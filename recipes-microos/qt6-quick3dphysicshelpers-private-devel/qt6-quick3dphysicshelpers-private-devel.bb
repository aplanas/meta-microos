SUMMARY = "Qt 6 Quick3DPhysicsHelpers library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3DPhysics private library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "qt6-quick3dphysicshelpers-private-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "873a964b52ddb1d1ba6365e50e8a31673d992ac5b078f04e87e709a903bf4992d9015c4a88b59ca136b477409a9a409586814df60634fb911e4f575d9dae740d"

RPROVIDES:${PN} += "cmake(Qt6Quick3DPhysicsHelpers) pkgconfig(Qt6Quick3DPhysicsHelpers) qt6-quick3dphysicshelpers-private-devel qt6-quick3dphysicshelpers-private-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Qml) cmake(Qt6Quick) cmake(Qt6Quick3D) libQt6Quick3DPhysicsHelpers6 pkgconfig(Qt6Qml) pkgconfig(Qt6Quick) pkgconfig(Qt6Quick3D) qt6-quick3dphysics-private-devel"

inherit rpm
