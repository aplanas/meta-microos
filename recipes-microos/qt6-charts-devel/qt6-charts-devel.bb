SUMMARY = "Qt 6 Charts library - Development files"
DESCRIPTION = "Development files for the Qt 6 Charts library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-charts-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "0f6e7b5b0ffb10154eae6e9ba72748fb4d7dc92d20f2336815eec971ba035c5851537d139ad9443a5c39a9e4f9c45ba94e27be5259a311a8a25285d91d938b80"

RPROVIDES:${PN} += "cmake(Qt6Charts) pkgconfig(Qt6Charts) qt6-charts-devel qt6-charts-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Gui) cmake(Qt6OpenGL) cmake(Qt6OpenGLWidgets) cmake(Qt6Widgets) libQt6Charts6 pkgconfig(Qt6Core) pkgconfig(Qt6Gui) pkgconfig(Qt6OpenGL) pkgconfig(Qt6OpenGLWidgets) pkgconfig(Qt6Widgets)"

inherit rpm
