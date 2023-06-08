SUMMARY = "Qt 6 VirtualKeyboard library - Development files"
DESCRIPTION = "Development files for the Qt 6 VirtualKeyboard library."
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "qt6-virtualkeyboard-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "ee46a4bd10caac6e45a57db7c566fc6fd4b43b0ce8d185c29d8eaec0c089bd4295ba3a1b543c4774f1f1022ae2e6e880a4041451e911ecefbcb531b99f07a11e"

RPROVIDES:${PN} += "cmake(Qt6VirtualKeyboard) pkgconfig(Qt6HunspellInputMethod) pkgconfig(Qt6VirtualKeyboard) qt6-virtualkeyboard-devel qt6-virtualkeyboard-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Gui) cmake(Qt6Qml) cmake(Qt6Quick) libQt6VirtualKeyboard6 pkgconfig(Qt6Core) pkgconfig(Qt6Gui) pkgconfig(Qt6Qml) pkgconfig(Qt6Quick) pkgconfig(Qt6VirtualKeyboard)"

inherit rpm
