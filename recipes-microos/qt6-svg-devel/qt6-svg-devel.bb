SUMMARY = "Qt 6 SVG libraries - Development files"
DESCRIPTION = "Development files for the Qt 6 SVG libraries."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-svg-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "a5619d88df4f33055566ecb4110a1901a2b2a3a59caae116b9fa2aa4e78dbe0ce725acf4ded29944eda538f28729df0e47cb31361274a00380e15f4fcd152dbd"

RPROVIDES:${PN} += "cmake(Qt6QSvgIconPlugin) cmake(Qt6QSvgPlugin) cmake(Qt6Svg) cmake(Qt6SvgWidgets) pkgconfig(Qt6Svg) pkgconfig(Qt6SvgWidgets) qt6-svg-devel qt6-svg-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Gui) cmake(Qt6Widgets) libQt6Svg6 libQt6SvgWidgets6 pkgconfig(Qt6Core) pkgconfig(Qt6Gui) pkgconfig(Qt6Svg) pkgconfig(Qt6Widgets)"

inherit rpm
