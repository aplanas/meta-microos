SUMMARY = "Breeze Style for Qt Quick Controls 2"
DESCRIPTION = "A Qt Quick Controls 2 style engine that uses the desktop style \
to draw controls with QStyle."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "5.27.4"

RPM_NAME = "qqc2-breeze-style-5.27.4-1.1.aarch64.rpm"
RPM_HASH = "e784755c9d3b31517369faae08e86833167581e2f58ebbac27bd9044da92e170e3808b82a8d8fe5838d47f61655416d06de608def5c8cd5922ad55aebd5ca213"

RPROVIDES:${PN} += "libqqc2breezestyleplugin.so()(64bit) qqc2-breeze-style qqc2-breeze-style(aarch-64) qt5qmlimport(org.kde.breeze.1) qt5qmlimport(org.kde.breeze.2) qt5qmlimport(org.kde.breeze.impl.1)"
RDEPENDS:${PN} += "kirigami2 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5GuiAddons.so.5()(64bit) libKF5IconThemes.so.5()(64bit) libKF5Kirigami2.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Quick.so.5()(64bit) libQt5Quick.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libqt5-qtquickcontrols2 libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) qt5qmlimport(QtQml.2) qt5qmlimport(QtQuick.2) qt5qmlimport(QtQuick.Controls.2) qt5qmlimport(QtQuick.Layouts.1) qt5qmlimport(QtQuick.Templates.2) qt5qmlimport(QtQuick.Window.2) qt5qmlimport(org.kde.breeze.1) qt5qmlimport(org.kde.kirigami.2) qt5qmlimport(org.kde.quickcharts.1)"

inherit rpm
