SUMMARY = "Qt6 Quick3DAssetUtils library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3DAssetUtils library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-quick3dassetutils-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "64a85510946b6b255fcd4474aac79a1246aab57887128eb87303b2fc7aff2822889848028f9e24d4d5859a77135bbdd61c6812bfd3999e0e48d67138e13f09ca"

RPROVIDES:${PN} += "cmake(Qt6Quick3DAssetUtils) pkgconfig(Qt6Quick3DAssetUtils) qt6-quick3dassetutils-devel qt6-quick3dassetutils-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libQt6Quick3DAssetUtils6 pkgconfig(Qt6Core) pkgconfig(Qt6Gui) pkgconfig(Qt6Quick) qt6-quick3d-private-devel qt6-quick3dassetimport-private-devel qt6-quick3druntimerender-private-devel qt6-quicktimeline-private-devel"

inherit rpm
