SUMMARY = "Plugin to render beautiful and interactive graphs"
DESCRIPTION = "A QtQuick plugin to render beautiful and interactive graphs."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "kqtquickcharts-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "bfa38ac380fde084f78d13027a628d145b92d028f0be70d14e0fe23aded9f425e6e66d3a8664c3c5613c95bee26aacc2135f9d081a76b06c3a08915f353cc815"

RPROVIDES:${PN} += "cmake(KQtQuickCharts) kqtquickcharts kqtquickcharts(aarch-64) libkqtquickcharts.so()(64bit) qt5qmlimport(org.kde.charts.0)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Quick.so.5()(64bit) libQt5Quick.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) qt5qmlimport(QtQuick.2) qt5qmlimport(org.kde.charts.0)"

inherit rpm
