SUMMARY = "Qt 6 UiTools library - Development files"
DESCRIPTION = "Development files for the Qt6 UiTools library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "6.5.0"

RPM_NAME = "qt6-uitools-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "055d7a9811be486f148559d689150119f771a3918b99e4f10ff2dc0aee06ade57259293280c5fd68e6deb51215b79d02f6742416382bebceda2961033a7d89cc"

RPROVIDES:${PN} += "cmake(Qt6UiTools) pkgconfig(Qt6UiTools) qt6-uitools-devel qt6-uitools-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Gui) cmake(Qt6OpenGL) cmake(Qt6OpenGLWidgets) cmake(Qt6UiPlugin) cmake(Qt6Widgets) libQt6UiTools6 pkgconfig(Qt6Core) pkgconfig(Qt6Gui) pkgconfig(Qt6OpenGLWidgets) pkgconfig(Qt6Widgets)"

inherit rpm
