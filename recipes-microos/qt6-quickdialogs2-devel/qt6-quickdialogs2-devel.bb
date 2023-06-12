SUMMARY = "Qt6 QuickDialogs2 library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickDialogs2 library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-quickdialogs2-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "00f53ed9733b1101c421b392fd4bdaee43550dac9f53c229d45a09200c4dc245be9554dc368212c04146f699cf3122401a1a8c38cea21cb83b5a339d84095cb0"

RPROVIDES:${PN} += "cmake(Qt6QuickDialogs2) pkgconfig(Qt6QuickDialogs2) qt6-quickdialogs2-devel qt6-quickdialogs2-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Gui) libQt6QuickDialogs2-6 pkgconfig(Qt6Core) pkgconfig(Qt6Gui) pkgconfig(Qt6Quick) qt6-qml-private-devel qt6-quickcontrols2impl-devel qt6-quickdialogs2quickimpl-private-devel qt6-quickdialogs2utils-private-devel"

inherit rpm
