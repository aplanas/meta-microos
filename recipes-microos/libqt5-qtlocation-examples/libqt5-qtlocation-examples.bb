SUMMARY = "Qt5 location examples"
DESCRIPTION = "Examples for libqt5-qtlocation module."
LICENSE = "BSD-3-Clause"

PV = "5.15.9+kde5"

RPM_NAME = "libqt5-qtlocation-examples-5.15.9+kde5-1.2.aarch64.rpm"
RPM_HASH = "e312ae24dee8c3a2df52f4c9fa91fde18e57ea45daf7df1dbc3e030d57877f9c81b53f274b9818f0e7d411926d4855e67b0c6de29c31ce7ecf1932a37180dabb"

RPROVIDES:${PN} += "libqt5-qtlocation-examples \
libqt5-qtlocation-examples(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Location.so.5()(64bit) \
libQt5Location.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Positioning.so.5()(64bit) \
libQt5Positioning.so.5(Qt_5)(64bit) \
libQt5Positioning.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
qt5qmlimport(Qt.labs.location.1) \
qt5qmlimport(Qt.labs.platform.1) \
qt5qmlimport(Qt.labs.qmlmodels.1) \
qt5qmlimport(QtLocation.5) \
qt5qmlimport(QtPositioning.5) \
qt5qmlimport(QtQml.Models.2) \
qt5qmlimport(QtQuick.2) \
qt5qmlimport(QtQuick.Controls.1) \
qt5qmlimport(QtQuick.Controls.2) \
qt5qmlimport(QtQuick.Controls.Styles.1) \
qt5qmlimport(QtQuick.Layouts.1) \
qt5qmlimport(QtQuick.Shapes.1) \
qt5qmlimport(QtQuick.Window.2)"

inherit rpm
