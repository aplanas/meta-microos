SUMMARY = "Qt6 QuickControls2Impl library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickControls2Impl library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-quickcontrols2impl-devel-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "6f59dd2de2f9b9a1b7ff72bfdd5c5f3574d0dbfecc719685c0b40be7705ec40b58c628c4b926c86fccb6520831f2ceef7fcfe13e2f92bd0938a7389e35d6505e"

RPROVIDES:${PN} += "cmake(Qt6QuickControls2Impl) pkgconfig(Qt6QuickControls2Impl) qt6-quickcontrols2impl-devel qt6-quickcontrols2impl-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Gui) libQt6QuickControls2Impl6 pkgconfig(Qt6Core) pkgconfig(Qt6Gui) pkgconfig(Qt6Quick) qt6-qml-private-devel qt6-quicktemplates2-private-devel"

inherit rpm
