SUMMARY = "Barcode abstraction layer library - QML files"
DESCRIPTION = "Prison is a barcode abstraction layer library providing \
uniform access to generation of barcodes with data. This package contains \
files that allow use of libprison with QtQuick based applications."
LICENSE = "MIT"

PV = "5.105.0"

RPM_NAME = "prison-qt5-imports-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "fb54651f7327108d594f3e516452872c7a82ee1ca357f98825b457d24b1ad672ccb020e302d195062b49986d4691e2227254ec9204d6cae577c4f037b7e23b58"

RPROVIDES:${PN} += "libprisonquickplugin.so()(64bit) libprisonscannerquickplugin.so()(64bit) prison-qt5-imports prison-qt5-imports(aarch-64) qt5qmlimport(org.kde.prison.1) qt5qmlimport(org.kde.prison.scanner.1)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Prison.so.5()(64bit) libKF5Prison5 libKF5PrisonScanner.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Quick.so.5()(64bit) libQt5Quick.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
