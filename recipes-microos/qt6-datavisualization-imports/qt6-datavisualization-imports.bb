SUMMARY = "Qt 6 DataVisualization QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 DataVisualization module."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-datavisualization-imports-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "3088699952c5cbf6d878f22ce39298e4b29856b3b367e857ebf246359b8bd99eeb85df71f62380289c0746beb5db1a984b77ce2d1cdd26b96497c128393727e1"

RPROVIDES:${PN} += "libdatavisualizationqmlplugin.so()(64bit) libdatavisualizationqmlplugin.so(Qt_6)(64bit) libdatavisualizationqmlplugin.so(Qt_6.0)(64bit) libdatavisualizationqmlplugin.so(Qt_6.1)(64bit) libdatavisualizationqmlplugin.so(Qt_6.2)(64bit) libdatavisualizationqmlplugin.so(Qt_6.3)(64bit) libdatavisualizationqmlplugin.so(Qt_6.4)(64bit) libdatavisualizationqmlplugin.so(Qt_6.5)(64bit) libdatavisualizationqmlplugin.so(Qt_6.5.0_PRIVATE_API)(64bit) qt6-datavisualization-imports qt6-datavisualization-imports(aarch-64)"
RDEPENDS:${PN} += "libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6DataVisualizationQml.so.6()(64bit) libQt6DataVisualizationQml.so.6(Qt_6)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
