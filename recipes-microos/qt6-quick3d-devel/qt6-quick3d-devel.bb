SUMMARY = "Qt 6 Quick3D library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3D library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-quick3d-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "10607839b3285d494a2903999bace941c415934164bb6f42b95059f1c2c0091424f897c5fad22f01113b7892a7f23f477ca13357e56b031c299bfe64e2272d90"

RPROVIDES:${PN} += "cmake(Qt6Quick3D) cmake(Qt6Quick3DTools) pkgconfig(Qt6Quick3D) qt6-quick3d-devel qt6-quick3d-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Qml) cmake(Qt6Quick3DRuntimeRender) libQt6Quick3D6 pkgconfig(Qt6Core) pkgconfig(Qt6Gui) pkgconfig(Qt6Qml) pkgconfig(Qt6Quick) pkgconfig(Qt6Quick3DRuntimeRender) qt6-quick3d"

inherit rpm
