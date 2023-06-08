SUMMARY = "Development files for the Qt5 SVG library"
DESCRIPTION = "You need this package if you want to compile programs with QtSvg."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde7"

RPM_NAME = "libqt5-qtsvg-devel-5.15.9+kde7-1.1.aarch64.rpm"
RPM_HASH = "8adc17db5797838d08b5b0ce4e2a5cc585ab5189cdf2fdfc738327b77245afe026b6f809b492c493b8297b9bb6f52d605b0e69bc373c8e37097ba5523346a926"

RPROVIDES:${PN} += "cmake(Qt5Svg) libQt5Svg-devel libqt5-qtsvg-devel libqt5-qtsvg-devel(aarch-64) pkgconfig(Qt5Svg)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libQt5Svg5 pkgconfig(Qt5Core) pkgconfig(Qt5Gui) pkgconfig(Qt5Widgets)"

inherit rpm
