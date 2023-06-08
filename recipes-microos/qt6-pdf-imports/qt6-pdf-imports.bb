SUMMARY = "Qt 6 Pdf QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 Pdf module"
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "qt6-pdf-imports-6.5.0-1.2.aarch64.rpm"
RPM_HASH = "f8247e31ff1611f34f858688937e9969ee176d80bf7ace5298abff72ee451af8448aa2013f078afea47a0b706240e88d612dc825adc2653140ed9328abb307f7"

RPROVIDES:${PN} += "libpdfquickplugin.so()(64bit) libpdfquickplugin.so(Qt_6)(64bit) libpdfquickplugin.so(Qt_6.0)(64bit) libpdfquickplugin.so(Qt_6.1)(64bit) libpdfquickplugin.so(Qt_6.2)(64bit) libpdfquickplugin.so(Qt_6.3)(64bit) libpdfquickplugin.so(Qt_6.4)(64bit) libpdfquickplugin.so(Qt_6.5)(64bit) libpdfquickplugin.so(Qt_6.5.0_PRIVATE_API)(64bit) qt6-pdf-imports qt6-pdf-imports(aarch-64) qt6qmlimport(QtQuick.Pdf.5) qt6qmlimport(QtQuick.Pdf.6)"
RDEPENDS:${PN} += "libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6PdfQuick.so.6()(64bit) libQt6PdfQuick.so.6(Qt_6)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
