SUMMARY = "Qt 6 Pdf QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 Pdf module"
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-pdf-imports-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "8bd462938f8a29251d52eff56defb5746d0c2e95d288dcaa3f5d0bf0c12375e3a2919f84f22b050cba8f17d74b200defb7540e2b3369ed07265aed6b7dbf6a52"

RPROVIDES:${PN} += "libpdfquickplugin.so()(64bit) libpdfquickplugin.so(Qt_6)(64bit) libpdfquickplugin.so(Qt_6.0)(64bit) libpdfquickplugin.so(Qt_6.1)(64bit) libpdfquickplugin.so(Qt_6.2)(64bit) libpdfquickplugin.so(Qt_6.3)(64bit) libpdfquickplugin.so(Qt_6.4)(64bit) libpdfquickplugin.so(Qt_6.5)(64bit) libpdfquickplugin.so(Qt_6.5.1_PRIVATE_API)(64bit) qt6-pdf-imports qt6-pdf-imports(aarch-64) qt6qmlimport(QtQuick.Pdf.5) qt6qmlimport(QtQuick.Pdf.6)"
RDEPENDS:${PN} += "libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6PdfQuick.so.6()(64bit) libQt6PdfQuick.so.6(Qt_6)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
