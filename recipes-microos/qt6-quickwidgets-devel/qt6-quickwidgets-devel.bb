SUMMARY = "Qt 6 QuickWidgets library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickWidgets library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-quickwidgets-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "0eaa63f8743067a55bc212c04c870236274781d59372f1a9ef39c888ab6a32eaebd241e111cdc496b5b0e876f6a05d52c29e8ebedec946701296e68e4102a2d6"

RPROVIDES:${PN} += "cmake(Qt6QuickWidgets) pkgconfig(Qt6QuickWidgets) qt6-quickwidgets-devel qt6-quickwidgets-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Gui) cmake(Qt6Qml) cmake(Qt6Quick) cmake(Qt6Widgets) libQt6QuickWidgets6 pkgconfig(Qt6Core) pkgconfig(Qt6Gui) pkgconfig(Qt6Qml) pkgconfig(Qt6Quick) pkgconfig(Qt6Widgets) qt6-opengl-private-devel"

inherit rpm
