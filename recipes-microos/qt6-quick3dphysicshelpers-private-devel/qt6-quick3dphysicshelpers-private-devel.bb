SUMMARY = "Qt 6 Quick3DPhysicsHelpers library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3DPhysics private library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-quick3dphysicshelpers-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "3a3e1882b4a25aa823ef540e33908d89ceb331c8a846c23fd2254b014b8baedafc4d436667050ea7f4b143b69fb46f57787c013a0fbfa9107b2b9827b5482538"

RPROVIDES:${PN} += "cmake(Qt6Quick3DPhysicsHelpers) \
pkgconfig(Qt6Quick3DPhysicsHelpers) \
qt6-quick3dphysicshelpers-private-devel \
qt6-quick3dphysicshelpers-private-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake(Qt6Qml) \
cmake(Qt6Quick) \
cmake(Qt6Quick3D) \
libQt6Quick3DPhysicsHelpers6 \
pkgconfig(Qt6Qml) \
pkgconfig(Qt6Quick) \
pkgconfig(Qt6Quick3D) \
qt6-quick3dphysics-private-devel"

inherit rpm
