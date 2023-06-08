SUMMARY = "Qt6 Quick3DRuntimeRender library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3DRuntimeRender library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-quick3druntimerender-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "9bce291f3b55da043e601c8b9eae2e35777dba6cddc4f607fa25618eaf3728573c9e1cd3aa493bf712097e88eb1ca7d47a5167e6103ea68acfdd09d29779a82a"

RPROVIDES:${PN} += "cmake(Qt6Quick3DRuntimeRender) pkgconfig(Qt6Quick3DRuntimeRender) qt6-quick3druntimerender-devel qt6-quick3druntimerender-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Quick3DUtils) cmake(Qt6ShaderTools) libQt6Quick3DRuntimeRender6 pkgconfig(Qt6Concurrent) pkgconfig(Qt6Core) pkgconfig(Qt6Gui) pkgconfig(Qt6Quick) pkgconfig(Qt6Quick3DUtils) pkgconfig(Qt6ShaderTools)"

inherit rpm
