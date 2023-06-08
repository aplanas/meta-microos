SUMMARY = "Qt 6 QuickTest library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickTest library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-quicktest-devel-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "780fa98aeb170caa7282ca81e4b7c06cb871627a054ae9fa4f2921a3b461bfe52e4a01c2169a83226fe3a366cb5154a71875589c069905e0a5269a4dbab9e859"

RPROVIDES:${PN} += "cmake(Qt6QuickTest) pkgconfig(Qt6QuickTest) qt6-quicktest-devel qt6-quicktest-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Gui) cmake(Qt6Quick) cmake(Qt6Test) libQt6QuickTest6 pkgconfig(Qt6Core) pkgconfig(Qt6Test) qt6-qml-private-devel qt6-quick-private-devel"

inherit rpm
