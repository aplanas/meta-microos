SUMMARY = "Qt 6 DataVisualization library - Development files"
DESCRIPTION = "Development files for the Qt 6 DataVisualization library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-datavisualization-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "292e5de5be371d325ba64f550634fcad9d2cdefadfe411dc92744a59ee5c02bfd0a0defb7f0dafd24d5b61df2e9db630dc521241ecbeaaecce3477e5b13de401"

RPROVIDES:${PN} += "cmake(Qt6DataVisualization) pkgconfig(Qt6DataVisualization) qt6-datavisualization-devel qt6-datavisualization-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Gui) cmake(Qt6OpenGL) cmake(Qt6Qml) cmake(Qt6Quick) libQt6DataVisualization6 pkgconfig(Qt6Core) pkgconfig(Qt6Gui) pkgconfig(Qt6OpenGL) pkgconfig(Qt6Qml) pkgconfig(Qt6Quick)"

inherit rpm
