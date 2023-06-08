SUMMARY = "Qt6 Quick3DParticles library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3DParticles library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-quick3dparticles-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "989af1b05d6d7c65bc45f9ec4960955b21ff94b823e509ceac6ead6c7cd29562ad98ac8834f71428c4ed3c02989ca2ec0288920751671fda9f5891a8503f0b50"

RPROVIDES:${PN} += "cmake(Qt6Quick3DParticles) pkgconfig(Qt6Quick3DParticles) qt6-quick3dparticles-devel qt6-quick3dparticles-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Quick3DAssetImport) cmake(Qt6Quick3DRuntimeRender) libQt6Quick3DParticles6 pkgconfig(Qt6Core) pkgconfig(Qt6Gui) pkgconfig(Qt6Qml) pkgconfig(Qt6Quick) pkgconfig(Qt6Quick3D) pkgconfig(Qt6Quick3DAssetImport) pkgconfig(Qt6Quick3DRuntimeRender)"

inherit rpm
