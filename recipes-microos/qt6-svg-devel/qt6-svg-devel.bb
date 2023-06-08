SUMMARY = "Qt 6 SVG libraries - Development files"
DESCRIPTION = "Development files for the Qt 6 SVG libraries."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-svg-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "831018fffbb8595248a7ccc8449d5efead33b2ba2f332e7a4f74ee21cd9ce2436424ec9717ee824590724ba7d69591c48f9dde6d17a0f1f711f6fd4da09e9ba8"

RPROVIDES:${PN} += "cmake(Qt6QSvgIconPlugin) cmake(Qt6QSvgPlugin) cmake(Qt6Svg) cmake(Qt6SvgWidgets) pkgconfig(Qt6Svg) pkgconfig(Qt6SvgWidgets) qt6-svg-devel qt6-svg-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Gui) cmake(Qt6Widgets) libQt6Svg6 libQt6SvgWidgets6 pkgconfig(Qt6Core) pkgconfig(Qt6Gui) pkgconfig(Qt6Svg) pkgconfig(Qt6Widgets)"

inherit rpm
