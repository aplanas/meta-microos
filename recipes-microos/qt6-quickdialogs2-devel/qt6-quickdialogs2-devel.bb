SUMMARY = "Qt6 QuickDialogs2 library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickDialogs2 library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-quickdialogs2-devel-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "af89eff2808f1374126ed37f8e20d8e85f1b7169290726d5c92db94b71a492029a3407fee587e5c1032c0be4fdd0c138f6178b0f0d16a83d9d99dcf288e82d32"

RPROVIDES:${PN} += "cmake(Qt6QuickDialogs2) pkgconfig(Qt6QuickDialogs2) qt6-quickdialogs2-devel qt6-quickdialogs2-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Gui) libQt6QuickDialogs2-6 pkgconfig(Qt6Core) pkgconfig(Qt6Gui) pkgconfig(Qt6Quick) qt6-qml-private-devel qt6-quickcontrols2impl-devel qt6-quickdialogs2quickimpl-private-devel qt6-quickdialogs2utils-private-devel"

inherit rpm
