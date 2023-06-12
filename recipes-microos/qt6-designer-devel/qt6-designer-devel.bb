SUMMARY = "Qt 6 Designer libraries - Development files"
DESCRIPTION = "Development files for the Qt6 Designer libraries."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "qt6-designer-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "0abd1b7bf8849843463a94ccf0fed8f78ba5b4e6d2fe4df061c854b5db616a3b63c6c60bffcd6cac521c5c4806f5e4fe0fb3ffd29982ed112aea01bdf63e0b85"

RPROVIDES:${PN} += "cmake(Qt6Designer) cmake(Qt6UiPlugin) pkgconfig(Qt6Designer) pkgconfig(Qt6UiPlugin) qt6-designer-devel qt6-designer-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Gui) cmake(Qt6OpenGLWidgets) cmake(Qt6Widgets) cmake(Qt6Xml) libQt6Designer6 pkgconfig(Qt6Core) pkgconfig(Qt6Gui) pkgconfig(Qt6OpenGLWidgets) pkgconfig(Qt6UiPlugin) pkgconfig(Qt6Widgets) pkgconfig(Qt6Xml)"

inherit rpm
