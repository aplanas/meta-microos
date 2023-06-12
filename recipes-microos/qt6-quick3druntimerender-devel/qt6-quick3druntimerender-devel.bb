SUMMARY = "Qt6 Quick3DRuntimeRender library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3DRuntimeRender library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quick3druntimerender-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "2b5e67e39ef8b6d115c8aa172bef564caa6d05b22de4a29faf4c00330d495896f6c86c427d49e32f1ca1b8f2ad1d1109144f21ee973ccf00a67a6d8bfd115d2a"

RPROVIDES:${PN} += "cmake(Qt6Quick3DRuntimeRender) \
pkgconfig(Qt6Quick3DRuntimeRender) \
qt6-quick3druntimerender-devel \
qt6-quick3druntimerender-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake(Qt6Quick3DUtils) \
cmake(Qt6ShaderTools) \
libQt6Quick3DRuntimeRender6 \
pkgconfig(Qt6Concurrent) \
pkgconfig(Qt6Core) \
pkgconfig(Qt6Gui) \
pkgconfig(Qt6Quick) \
pkgconfig(Qt6Quick3DUtils) \
pkgconfig(Qt6ShaderTools)"

inherit rpm
