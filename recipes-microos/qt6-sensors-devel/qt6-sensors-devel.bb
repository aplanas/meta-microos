SUMMARY = "Qt 6 Sensors library - Development files"
DESCRIPTION = "Development files for the Qt 6 Sensors library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-sensors-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "d5b9d142d9cb892e3bf5f05060af5d75320dac67c8fcfb7e08e1706122b40525e658f6206adfca95f38fe53d3c30c5bd2caab79b4d10298225f1a782928fdcf8"

RPROVIDES:${PN} += "cmake(Qt6Sensors) pkgconfig(Qt6Sensors) qt6-sensors-devel qt6-sensors-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Core) libQt6Sensors6 pkgconfig(Qt6Core)"

inherit rpm
