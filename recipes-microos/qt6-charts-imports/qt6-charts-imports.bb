SUMMARY = "Qt 6 Charts QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 Charts module."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-charts-imports-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "9e5e539c95465d1e836e9b119485d7cac76f170d7b93b6d1b8ff45591e014d7b716d298e3a369b4a307db4be5e3ac6fd7be670c8124ca61c7cf8360f7f04893f"

RPROVIDES:${PN} += "libqtchartsqml2plugin.so()(64bit) libqtchartsqml2plugin.so(Qt_6)(64bit) libqtchartsqml2plugin.so(Qt_6.0)(64bit) libqtchartsqml2plugin.so(Qt_6.1)(64bit) libqtchartsqml2plugin.so(Qt_6.2)(64bit) libqtchartsqml2plugin.so(Qt_6.3)(64bit) libqtchartsqml2plugin.so(Qt_6.4)(64bit) libqtchartsqml2plugin.so(Qt_6.5)(64bit) libqtchartsqml2plugin.so(Qt_6.5.0_PRIVATE_API)(64bit) qt6-charts-imports qt6-charts-imports(aarch-64)"
RDEPENDS:${PN} += "libQt6ChartsQml.so.6()(64bit) libQt6ChartsQml.so.6(Qt_6)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
