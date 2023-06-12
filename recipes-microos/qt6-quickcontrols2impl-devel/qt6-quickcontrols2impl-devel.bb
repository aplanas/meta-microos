SUMMARY = "Qt6 QuickControls2Impl library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickControls2Impl library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-quickcontrols2impl-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "74718792837fa8aa3f7f5daa0741ef4536ad455e80d0c77c7044b71bb9c3d4712e022c1e343d9dbbf3d34ea0bda385f760c06be130460c63f27b41ad8ffa9a06"

RPROVIDES:${PN} += "cmake(Qt6QuickControls2Impl) pkgconfig(Qt6QuickControls2Impl) qt6-quickcontrols2impl-devel qt6-quickcontrols2impl-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Gui) libQt6QuickControls2Impl6 pkgconfig(Qt6Core) pkgconfig(Qt6Gui) pkgconfig(Qt6Quick) qt6-qml-private-devel qt6-quicktemplates2-private-devel"

inherit rpm
