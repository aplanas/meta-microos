SUMMARY = "Qt 6 Charts library - Development files"
DESCRIPTION = "Development files for the Qt 6 Charts library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-charts-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "87ff43f721e227f9a2efe571ce5f16dc2d2fe69980a4d03b2559f1c9a087581889c1232d733ad76e5fd6e9e0283cf4fba03c7d9faeb32784ff9797e0ae20265e"

RPROVIDES:${PN} += "cmake(Qt6Charts) pkgconfig(Qt6Charts) qt6-charts-devel qt6-charts-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Gui) cmake(Qt6OpenGL) cmake(Qt6OpenGLWidgets) cmake(Qt6Widgets) libQt6Charts6 pkgconfig(Qt6Core) pkgconfig(Qt6Gui) pkgconfig(Qt6OpenGL) pkgconfig(Qt6OpenGLWidgets) pkgconfig(Qt6Widgets)"

inherit rpm
