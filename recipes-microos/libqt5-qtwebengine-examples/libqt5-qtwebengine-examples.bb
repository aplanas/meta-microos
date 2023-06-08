SUMMARY = "Qt5 WebEngine examples"
DESCRIPTION = "Examples for the libqt5-qtwebengine module."
LICENSE = "LGPL-3.0-only | GPL-2.0-only | GPL-3.0-only"

PV = "5.15.13"

RPM_NAME = "libqt5-qtwebengine-examples-5.15.13-3.2.aarch64.rpm"
RPM_HASH = "adc52cde9f841a0f0ad45105faa7b9cc7b31158174e24aede98518f6efb09bc6fbe05a3bee42449cfdff29605b98b96eeddc6be95b8aae19a0d6aeba1bf7926f"

RPROVIDES:${PN} += "libqt5-qtwebengine-examples libqt5-qtwebengine-examples(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5PrintSupport.so.5()(64bit) libQt5PrintSupport.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5QuickControls2.so.5()(64bit) libQt5QuickControls2.so.5(Qt_5)(64bit) libQt5WebChannel.so.5()(64bit) libQt5WebChannel.so.5(Qt_5)(64bit) libQt5WebEngine.so.5()(64bit) libQt5WebEngine.so.5(Qt_5)(64bit) libQt5WebEngineCore.so.5()(64bit) libQt5WebEngineCore.so.5(Qt_5)(64bit) libQt5WebEngineWidgets.so.5()(64bit) libQt5WebEngineWidgets.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libqt5-qtquickcontrols2 libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) qt5qmlimport(Qt.labs.settings.1) qt5qmlimport(QtQml.2) qt5qmlimport(QtQml.Models.2) qt5qmlimport(QtQuick.2) qt5qmlimport(QtQuick.Controls.1) qt5qmlimport(QtQuick.Controls.2) qt5qmlimport(QtQuick.Controls.Material.2) qt5qmlimport(QtQuick.Controls.Private.1) qt5qmlimport(QtQuick.Controls.Styles.1) qt5qmlimport(QtQuick.Dialogs.1) qt5qmlimport(QtQuick.Layouts.1) qt5qmlimport(QtQuick.Window.2) qt5qmlimport(QtWebEngine.1)"

inherit rpm
