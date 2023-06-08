SUMMARY = "Qt 6 QuickControls2 library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickControls2 library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-quickcontrols2-devel-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "cfb8c965f9ae151585396b61710fc2b795dd802e6d0a17b18be3e27644a6d3b5fa7a427ed8f8b43d9709aa7f9056d763d5975e8e8dea3f3c2399dada0c69310f"

RPROVIDES:${PN} += "cmake(Qt6QuickControls2) pkgconfig(Qt6QuickControls2) qt6-quickcontrols2-devel qt6-quickcontrols2-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Quick) libQt6QuickControls2-6 pkgconfig(Qt6Core) pkgconfig(Qt6Gui) pkgconfig(Qt6Quick) qt6-qml-private-devel qt6-quicktemplates2-private-devel"

inherit rpm
