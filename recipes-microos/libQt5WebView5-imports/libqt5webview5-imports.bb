SUMMARY = "Qt 5 WebView Library - QML imports"
DESCRIPTION = "Qt WebView provides a way to display web content in a QML application \
without necessarily including a full web browser stack by using \
native APIs where it makes sense."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde0"

RPM_NAME = "libQt5WebView5-imports-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "cae01f3a4866c3bae28d38e467cddff3cdc33858d0d09d350c1b67ecc6c67f784400be311b714c12ee76dfb78549ccd35f7b69fd48f931fc94be75f77758304a"

RPROVIDES:${PN} += "libQt5WebView5-imports libQt5WebView5-imports(aarch-64) libdeclarative_webview.so()(64bit) qt5qmlimport(QtWebView.1)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Quick.so.5()(64bit) libQt5Quick.so.5(Qt_5)(64bit) libQt5WebView.so.5()(64bit) libQt5WebView.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQtQuick5 libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
