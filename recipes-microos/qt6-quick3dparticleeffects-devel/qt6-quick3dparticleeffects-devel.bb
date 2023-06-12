SUMMARY = "Qt6 Quick3DParticleEffects library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3DParticleEffects library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quick3dparticleeffects-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "78db9b2b87435f34d35b63986cefc5cc6083a618fc34242b885b9f7b250c9606c5184fcfe6ee12c79fda738095dd624267faffbe63d882f5a25adb453f09d599"

RPROVIDES:${PN} += "cmake(Qt6Quick3DParticleEffects) \
pkgconfig(Qt6Quick3DParticleEffects) \
qt6-quick3dparticleeffects-devel \
qt6-quick3dparticleeffects-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake(Qt6Quick3DAssetImport) \
cmake(Qt6Quick3DParticles) \
cmake(Qt6Quick3DRuntimeRender) \
libQt6Quick3DParticleEffects6 \
pkgconfig(Qt6Core) \
pkgconfig(Qt6Gui) \
pkgconfig(Qt6Qml) \
pkgconfig(Qt6Quick) \
pkgconfig(Qt6Quick3D) \
pkgconfig(Qt6Quick3DAssetImport) \
pkgconfig(Qt6Quick3DParticles) \
pkgconfig(Qt6Quick3DRuntimeRender)"

inherit rpm
