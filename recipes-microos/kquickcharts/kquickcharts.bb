SUMMARY = "Set of charts for QtQuick applications"
DESCRIPTION = "The Quick Charts module provides a set of charts that can be used from QtQuick \
applications. They are intended to be used for both simple display of data as \
well as continuous display of high-volume data (often referred to as plotters). \
The charts use a system called distance fields for their accelerated rendering, \
which provides ways of using the GPU for rendering 2D shapes without loss of \
quality."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "kquickcharts-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "a8b8bc0c8bda2aee34a6b9df160f162198f42a42ed1d77f3f0056bbd34b255330ede4690787c80b1c9779931c9daa18f3941e115f5f8d690a266c0339d40fde0"

RPROVIDES:${PN} += "kquickcharts kquickcharts(aarch-64) libQuickCharts.so()(64bit) libQuickChartsControls.so()(64bit) qt5qmlimport(org.kde.quickcharts.1) qt5qmlimport(org.kde.quickcharts.controls.1)"
RDEPENDS:${PN} += "kirigami2 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Quick.so.5()(64bit) libQt5Quick.so.5(Qt_5)(64bit) libQt5QuickControls2.so.5()(64bit) libQt5QuickControls2.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.32)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libqt5-qtquickcontrols2 libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) qt5qmlimport(QtQuick.2) qt5qmlimport(QtQuick.Controls.2) qt5qmlimport(QtQuick.Layouts.1) qt5qmlimport(org.kde.kirigami.2) qt5qmlimport(org.kde.quickcharts.1) qt5qmlimport(org.kde.quickcharts.controls.1)"

inherit rpm
