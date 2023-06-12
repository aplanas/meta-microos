SUMMARY = "Qt5 PDF examples"
DESCRIPTION = "Examples for the libqt5-qtpdf module."
LICENSE = "LGPL-3.0-only | GPL-2.0-only | GPL-3.0-only"

PV = "5.15.14"

RPM_NAME = "libqt5-qtpdf-examples-5.15.14-1.1.aarch64.rpm"
RPM_HASH = "2d7e7e780a5a6be02d1e0aefd033494170e2c7f1d1bf2edf90f956ab6ef717fe92f5cf58887b22e37dac9f46b351ea7a34ee64deb7550e81f6273bb470267000"

RPROVIDES:${PN} += "libqt5-qtpdf-examples libqt5-qtpdf-examples(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Pdf.so.5()(64bit) libQt5Pdf.so.5(Qt_5)(64bit) libQt5PdfWidgets.so.5()(64bit) libQt5PdfWidgets.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) qt5qmlimport(Qt.labs.animation.1) qt5qmlimport(Qt.labs.platform.1) qt5qmlimport(QtQml.2) qt5qmlimport(QtQuick.2) qt5qmlimport(QtQuick.Controls.2) qt5qmlimport(QtQuick.Layouts.1) qt5qmlimport(QtQuick.Pdf.5) qt5qmlimport(QtQuick.Shapes.1) qt5qmlimport(QtQuick.Window.2)"

inherit rpm
