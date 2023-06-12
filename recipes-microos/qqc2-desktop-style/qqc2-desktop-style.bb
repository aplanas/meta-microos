SUMMARY = "A Qt Quick Controls 2 Style for Desktop UIs"
DESCRIPTION = "A Qt Quick Controls 2 style engine that uses the desktop style \
to draw controls with QStyle."
LICENSE = "GPL-2.0-or-later"

PV = "5.106.0"

RPM_NAME = "qqc2-desktop-style-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "f2c65a5932f1496b29762607a7122f572c196a81cc78034fc90305556d3ea6dd4451b5a67a674fa51091ed0d69a676c4b009f0dbec2d3fd1eb0c3248f4a1076d"

RPROVIDES:${PN} += "libqqc2desktopstyleplugin.so()(64bit) \
plasma5-qqc2-style \
qqc2-desktop-style \
qqc2-desktop-style(aarch-64) \
qt5qmlimport(org.kde.qqc2desktopstyle.private.1)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5IconThemes.so.5()(64bit) \
libKF5Kirigami2.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libqt5-qtquickcontrols2 \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
qt5qmlimport(QtQml.2) \
qt5qmlimport(QtQml.Models.2) \
qt5qmlimport(QtQuick.2) \
qt5qmlimport(QtQuick.Controls.2) \
qt5qmlimport(QtQuick.Layouts.1) \
qt5qmlimport(QtQuick.Templates.2) \
qt5qmlimport(QtQuick.Window.2) \
qt5qmlimport(org.kde.kirigami.2) \
qt5qmlimport(org.kde.qqc2desktopstyle.private.1) \
qt5qmlimport(org.kde.sonnet.1)"

inherit rpm
