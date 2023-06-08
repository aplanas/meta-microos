SUMMARY = "Qt 6 QuickWidgets library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickWidgets library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-quickwidgets-devel-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "1e80a0b71c57a50e9534b7f7c011d0fc291219f927c66c3ac6250d87325c4233b9c1b1c1df7040e84a5200cf3e60363244a060bd0e0223fb08ae1c88d5c6aab8"

RPROVIDES:${PN} += "cmake(Qt6QuickWidgets) pkgconfig(Qt6QuickWidgets) qt6-quickwidgets-devel qt6-quickwidgets-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Gui) cmake(Qt6Qml) cmake(Qt6Quick) cmake(Qt6Widgets) libQt6QuickWidgets6 pkgconfig(Qt6Core) pkgconfig(Qt6Gui) pkgconfig(Qt6Qml) pkgconfig(Qt6Quick) pkgconfig(Qt6Widgets) qt6-opengl-private-devel"

inherit rpm
