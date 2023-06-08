SUMMARY = "Qt5 location examples"
DESCRIPTION = "Examples for libqt5-qtlocation module."
LICENSE = "BSD-3-Clause"

PV = "5.15.9+kde5"

RPM_NAME = "libqt5-qtlocation-examples-5.15.9+kde5-1.1.aarch64.rpm"
RPM_HASH = "634dbcd7c2a69471de37c1858a35f354488be91e01f54f5b3cbbd665703805f1087798e362daa62e70b9a072fec2ab069f5e2c807a3e624440e2f1f244bae9b1"

RPROVIDES:${PN} += "libqt5-qtlocation-examples libqt5-qtlocation-examples(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Location.so.5()(64bit) libQt5Location.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5Positioning.so.5()(64bit) libQt5Positioning.so.5(Qt_5)(64bit) libQt5Positioning.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Quick.so.5()(64bit) libQt5Quick.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) qt5qmlimport(Qt.labs.location.1) qt5qmlimport(Qt.labs.platform.1) qt5qmlimport(Qt.labs.qmlmodels.1) qt5qmlimport(QtLocation.5) qt5qmlimport(QtPositioning.5) qt5qmlimport(QtQml.Models.2) qt5qmlimport(QtQuick.2) qt5qmlimport(QtQuick.Controls.1) qt5qmlimport(QtQuick.Controls.2) qt5qmlimport(QtQuick.Controls.Styles.1) qt5qmlimport(QtQuick.Layouts.1) qt5qmlimport(QtQuick.Shapes.1) qt5qmlimport(QtQuick.Window.2)"

inherit rpm
