SUMMARY = "Qt6 Quick3DAssetUtils library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3DAssetUtils library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quick3dassetutils-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "f9b9a3422fee1150759ed5af98d6df6fb45337cf3d9460a8a1c24fb665f60fa2fdfb925431c568babe6b627532023b29c22972cbd3da5e52707bce0d157078a0"

RPROVIDES:${PN} += "cmake(Qt6Quick3DAssetUtils) \
pkgconfig(Qt6Quick3DAssetUtils) \
qt6-quick3dassetutils-devel \
qt6-quick3dassetutils-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt6Quick3DAssetUtils6 \
pkgconfig(Qt6Core) \
pkgconfig(Qt6Gui) \
pkgconfig(Qt6Quick) \
qt6-quick3d-private-devel \
qt6-quick3dassetimport-private-devel \
qt6-quick3druntimerender-private-devel \
qt6-quicktimeline-private-devel"

inherit rpm
