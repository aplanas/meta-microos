SUMMARY = "QML imports for the Qt5 Gamepad module"
DESCRIPTION = "This package contains QML import files for the Qt5 Gamepad module."
LICENSE = "LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later"

PV = "5.15.9+kde0"

RPM_NAME = "libqt5-qtgamepad-imports-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "1542879e21742b8dc16c02998484c4347aa51de04b50c10cf14a7690ad51e7cae3e264451b45ad5c28f05443dcb57524f09ed43307bd4071baf003ffb3fb900e"

RPROVIDES:${PN} += "libdeclarative_gamepad.so()(64bit) \
libqt5-qtgamepad-imports \
libqt5-qtgamepad-imports(aarch-64) \
qt5qmlimport(QtGamepad.1)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gamepad.so.5()(64bit) \
libQt5Gamepad.so.5(Qt_5)(64bit) \
libQt5Gamepad5 \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libQtQuick5 \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
