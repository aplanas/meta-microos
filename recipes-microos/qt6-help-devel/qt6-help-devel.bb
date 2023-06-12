SUMMARY = "Qt 6 Help library - Development files"
DESCRIPTION = "Development files for the Qt6 Help library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "qt6-help-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "98dad931b098ef5e5c8ed42a8db657c4b4d9703eb10b48147f09a80a24d3925fd4c11d5083c6ae07e14eee72509009bc22df320f581ede57b22dc295851cc04a"

RPROVIDES:${PN} += "cmake(Qt6Help) pkgconfig(Qt6Help) qt6-help-devel qt6-help-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Gui) cmake(Qt6Network) cmake(Qt6Sql) cmake(Qt6Widgets) libQt6Help6 pkgconfig(Qt6Core) pkgconfig(Qt6Gui) pkgconfig(Qt6Sql) pkgconfig(Qt6Widgets)"

inherit rpm
