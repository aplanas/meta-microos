SUMMARY = "Qt 6 Designer libraries - Development files"
DESCRIPTION = "Development files for the Qt6 Designer libraries."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "6.5.0"

RPM_NAME = "qt6-designer-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "19622c01b852f63db1f2264ca7872e794c6f52a5d858fe5cfcc969cdb5a6ed9c1645790a12ef9b09832867737662276dbb7cdc0407c4108ef017fc6aa4f50068"

RPROVIDES:${PN} += "cmake(Qt6Designer) cmake(Qt6UiPlugin) pkgconfig(Qt6Designer) pkgconfig(Qt6UiPlugin) qt6-designer-devel qt6-designer-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Gui) cmake(Qt6OpenGLWidgets) cmake(Qt6Widgets) cmake(Qt6Xml) libQt6Designer6 pkgconfig(Qt6Core) pkgconfig(Qt6Gui) pkgconfig(Qt6OpenGLWidgets) pkgconfig(Qt6UiPlugin) pkgconfig(Qt6Widgets) pkgconfig(Qt6Xml)"

inherit rpm
