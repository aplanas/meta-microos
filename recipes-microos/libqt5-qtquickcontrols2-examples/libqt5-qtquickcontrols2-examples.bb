SUMMARY = "Qt5 quickcontrols2 examples"
DESCRIPTION = "Examples for libqt5-qtquickcontrols2 module."
LICENSE = "BSD-3-Clause"

PV = "5.15.9+kde5"

RPM_NAME = "libqt5-qtquickcontrols2-examples-5.15.9+kde5-1.1.aarch64.rpm"
RPM_HASH = "7fa135a207adcac616c6d478d1ec569877b2218a182745e58e9356f9c6721b490c1b4a9458840025fa90b7f947bbdce9b8fd0f07ea3fbeb6a6903a08fb2ca6c2"

RPROVIDES:${PN} += "libqt5-qtquickcontrols2-examples libqt5-qtquickcontrols2-examples(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Quick.so.5()(64bit) libQt5Quick.so.5(Qt_5)(64bit) libQt5QuickControls2.so.5()(64bit) libQt5QuickControls2.so.5(Qt_5)(64bit) libQt5Sql.so.5()(64bit) libQt5Sql.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) qt5qmlimport(Qt.labs.platform.1) qt5qmlimport(Qt.labs.settings.1) qt5qmlimport(QtGraphicalEffects.1) qt5qmlimport(QtQuick.2) qt5qmlimport(QtQuick.Controls.2) qt5qmlimport(QtQuick.Controls.Imagine.2) qt5qmlimport(QtQuick.Controls.Material.2) qt5qmlimport(QtQuick.Controls.Universal.2) qt5qmlimport(QtQuick.Layouts.1) qt5qmlimport(QtQuick.Templates.2) qt5qmlimport(QtQuick.Window.2)"

inherit rpm
