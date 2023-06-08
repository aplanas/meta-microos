SUMMARY = "Qt5 quickcontrols examples"
DESCRIPTION = "Examples for libqt5-qtquickcontrols module."
LICENSE = "BSD-3-Clause"

PV = "5.15.9+kde0"

RPM_NAME = "libqt5-qtquickcontrols-examples-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "305f5dfe54b929598b63bd16985320aa0b561a9f6e9a7020c0f98320eaeaa7f7393071790ec66e13107dd8428b6a76c1a3eded2795ac12febd087afd7a1314d7"

RPROVIDES:${PN} += "libqt5-qtquickcontrols-examples libqt5-qtquickcontrols-examples(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Quick.so.5()(64bit) libQt5Quick.so.5(Qt_5)(64bit) libQt5Sql.so.5()(64bit) libQt5Sql.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) qt5qmlimport(QtGraphicalEffects.1) qt5qmlimport(QtQml.2) qt5qmlimport(QtQml.Models.2) qt5qmlimport(QtQuick.2) qt5qmlimport(QtQuick.Controls.1) qt5qmlimport(QtQuick.Controls.Private.1) qt5qmlimport(QtQuick.Controls.Styles.1) qt5qmlimport(QtQuick.Controls.Styles.Flat.1) qt5qmlimport(QtQuick.Dialogs.1) qt5qmlimport(QtQuick.Extras.1) qt5qmlimport(QtQuick.Extras.Private.1) qt5qmlimport(QtQuick.Layouts.1) qt5qmlimport(QtQuick.Particles.2) qt5qmlimport(QtQuick.Window.2) qt5qmlimport(QtQuick.XmlListModel.2)"

inherit rpm
