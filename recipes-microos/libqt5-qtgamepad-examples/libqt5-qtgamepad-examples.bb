SUMMARY = "Qt5 gamepad examples"
DESCRIPTION = "Examples for the libqt5-qtgamepad module."
LICENSE = "BSD-3-Clause & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde0"

RPM_NAME = "libqt5-qtgamepad-examples-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "739ecec2313a9c8ab4a04d5dabb900ff3ce4459813419953011a32b0e5a1a5105e955319a38360bb31034505088c6bb1f63988295fda160467d3d71dd9b5495f"

RPROVIDES:${PN} += "libqt5-qtgamepad-examples libqt5-qtgamepad-examples(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gamepad.so.5()(64bit) libQt5Gamepad.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) qt5qmlimport(QtGamepad.1) qt5qmlimport(QtQuick.2) qt5qmlimport(QtQuick.Window.2)"

inherit rpm
