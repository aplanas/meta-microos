SUMMARY = "Qt6 Quick3DParticleEffects library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3DParticleEffects library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-quick3dparticleeffects-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "641641128f47354a053dd717b1ec07767286b164e5f42860336c013adef2f26c3ad43d008dce4e451e8023e3378b6f9f0572ca5adf98f30023498c8d5a10f28f"

RPROVIDES:${PN} += "cmake(Qt6Quick3DParticleEffects) pkgconfig(Qt6Quick3DParticleEffects) qt6-quick3dparticleeffects-devel qt6-quick3dparticleeffects-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Quick3DAssetImport) cmake(Qt6Quick3DParticles) cmake(Qt6Quick3DRuntimeRender) libQt6Quick3DParticleEffects6 pkgconfig(Qt6Core) pkgconfig(Qt6Gui) pkgconfig(Qt6Qml) pkgconfig(Qt6Quick) pkgconfig(Qt6Quick3D) pkgconfig(Qt6Quick3DAssetImport) pkgconfig(Qt6Quick3DParticles) pkgconfig(Qt6Quick3DRuntimeRender)"

inherit rpm
