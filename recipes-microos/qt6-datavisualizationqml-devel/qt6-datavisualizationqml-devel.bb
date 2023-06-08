SUMMARY = "Qt 6 DataVisualizationQml library - Development files"
DESCRIPTION = "Development files for the Qt 6 DataVisualizationQml library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-datavisualizationqml-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "55756bbd5e86043bdbe1bcff45fd16c43bebf5b010d008c9cb439a2847a15864bff0070c59f2c7d38ccc177ec5b72c15c738898afd8faf8ad5cc2147b323f812"

RPROVIDES:${PN} += "cmake(Qt6DataVisualizationQml) pkgconfig(Qt6DataVisualizationQml) qt6-datavisualizationqml-devel qt6-datavisualizationqml-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Gui) cmake(Qt6OpenGL) cmake(Qt6Qml) cmake(Qt6Quick) libQt6DataVisualizationQml6 qt6-datavisualization-private-devel"

inherit rpm
