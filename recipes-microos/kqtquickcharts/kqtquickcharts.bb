SUMMARY = "Plugin to render beautiful and interactive graphs"
DESCRIPTION = "A QtQuick plugin to render beautiful and interactive graphs."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "kqtquickcharts-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "471aaa9710803abc103bf714ee26360b7bed51e7196aecfb88ffe35099a421e4cd3e19ae885f72ab8c7edf6cda9cb58228de65f99d813ad9d231f1b0fc168e9d"

RPROVIDES:${PN} += "cmake(KQtQuickCharts) kqtquickcharts kqtquickcharts(aarch-64) libkqtquickcharts.so()(64bit) qt5qmlimport(org.kde.charts.0)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Quick.so.5()(64bit) libQt5Quick.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) qt5qmlimport(QtQuick.2) qt5qmlimport(org.kde.charts.0)"

inherit rpm
