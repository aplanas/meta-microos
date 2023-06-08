SUMMARY = "Qt5 PDF module for QML"
DESCRIPTION = "Qt Quick module for the Qt PDF library."
LICENSE = "LGPL-3.0-only | GPL-2.0-only | GPL-3.0-only"

PV = "5.15.13"

RPM_NAME = "libqt5-qtpdf-imports-5.15.13-3.2.aarch64.rpm"
RPM_HASH = "7e79b7507ecdbe4c6a84ded8c2a9cf0649fcc9edcbe7e352e5bd8aaedd116a38af4ac12778437a753d77ab74ef9dac484014787aa6d832a680c9f58398025ca5"

RPROVIDES:${PN} += "libpdfplugin.so()(64bit) libqt5-qtpdf-imports libqt5-qtpdf-imports(aarch-64) qt5qmlimport(QtQuick.Pdf.2) qt5qmlimport(QtQuick.Pdf.5)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Pdf.so.5()(64bit) libQt5Pdf.so.5(Qt_5)(64bit) libQt5Pdf.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Quick.so.5()(64bit) libQt5Quick.so.5(Qt_5)(64bit) libQt5Quick.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) qt5qmlimport(Qt.labs.animation.1) qt5qmlimport(QtQuick.2) qt5qmlimport(QtQuick.Controls.2) qt5qmlimport(QtQuick.Layouts.1) qt5qmlimport(QtQuick.Pdf.5) qt5qmlimport(QtQuick.Shapes.1) qt5qmlimport(QtQuick.Window.2)"

inherit rpm
