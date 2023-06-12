SUMMARY = "Qt 6 VirtualKeyboard library - Development files"
DESCRIPTION = "Development files for the Qt 6 VirtualKeyboard library."
LICENSE = "GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-virtualkeyboard-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "dabb8dd1028cec43f4d0ddc251b03b4bafce7ce574df6395840234820f864ce27490141a7f29447cc95ebd88503ea19655147a2027ed12bc4cc5f9ae333f2ae6"

RPROVIDES:${PN} += "cmake(Qt6VirtualKeyboard) pkgconfig(Qt6HunspellInputMethod) pkgconfig(Qt6VirtualKeyboard) qt6-virtualkeyboard-devel qt6-virtualkeyboard-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Gui) cmake(Qt6Qml) cmake(Qt6Quick) libQt6VirtualKeyboard6 pkgconfig(Qt6Core) pkgconfig(Qt6Gui) pkgconfig(Qt6Qml) pkgconfig(Qt6Quick) pkgconfig(Qt6VirtualKeyboard)"

inherit rpm
