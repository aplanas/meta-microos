SUMMARY = "Qt 6 Help library - Development files"
DESCRIPTION = "Development files for the Qt6 Help library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "6.5.0"

RPM_NAME = "qt6-help-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "30e3470976a7e6a9f5ae6fd68b95dad35ac56b984a9c5259f2f5a594714401b194fa36fa7b4f4cfd75f40bf1b7898dafd0a975c3de75a847ff212894d4c48cff"

RPROVIDES:${PN} += "cmake(Qt6Help) pkgconfig(Qt6Help) qt6-help-devel qt6-help-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Gui) cmake(Qt6Network) cmake(Qt6Sql) cmake(Qt6Widgets) libQt6Help6 pkgconfig(Qt6Core) pkgconfig(Qt6Gui) pkgconfig(Qt6Sql) pkgconfig(Qt6Widgets)"

inherit rpm
