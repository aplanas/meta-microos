SUMMARY = "Qt6 Quick3DEffects library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3DEffects library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-quick3deffects-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "e4ca560802e14b56bd816e24c49a0a5ebd638ecd0ad1a73ccc63d95c670f6056e5d62701e25eaf2b245f16098840b251dfe4026dc3ab69e01b547e07dc2277ac"

RPROVIDES:${PN} += "cmake(Qt6Quick3DEffects) pkgconfig(Qt6Quick3DEffects) qt6-quick3deffects-devel qt6-quick3deffects-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Qml) libQt6Quick3DEffects6 pkgconfig(Qt6Qml) pkgconfig(Qt6Quick) pkgconfig(Qt6Quick3D) qt6-quick3d-private-devel"

inherit rpm
