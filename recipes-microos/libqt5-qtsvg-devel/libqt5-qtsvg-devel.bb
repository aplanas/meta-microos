SUMMARY = "Development files for the Qt5 SVG library"
DESCRIPTION = "You need this package if you want to compile programs with QtSvg."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde8"

RPM_NAME = "libqt5-qtsvg-devel-5.15.9+kde8-1.1.aarch64.rpm"
RPM_HASH = "a991e1960374f5f70c9938dc5a328846f68209411678f556f16419b4434c59bc253b1dd30419114559fc91ebfa5d981e2febef487c588297e86c8b47a7673a8d"

RPROVIDES:${PN} += "cmake(Qt5Svg) libQt5Svg-devel libqt5-qtsvg-devel libqt5-qtsvg-devel(aarch-64) pkgconfig(Qt5Svg)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libQt5Svg5 pkgconfig(Qt5Core) pkgconfig(Qt5Gui) pkgconfig(Qt5Widgets)"

inherit rpm
