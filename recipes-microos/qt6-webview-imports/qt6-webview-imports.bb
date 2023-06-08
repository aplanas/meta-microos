SUMMARY = "Qt 6 WebView QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 WebView module"
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-webview-imports-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "c8e4bd659b71dc8e619a6ff7ad43da1a27e23cc8f78c34a82346c87902f7558466aa9371b627288f51995fc79e70fcbd8558bac54f40b319d965c31088372af8"

RPROVIDES:${PN} += "libqtwebviewquickplugin.so()(64bit) libqtwebviewquickplugin.so(Qt_6)(64bit) libqtwebviewquickplugin.so(Qt_6.0)(64bit) libqtwebviewquickplugin.so(Qt_6.1)(64bit) libqtwebviewquickplugin.so(Qt_6.2)(64bit) libqtwebviewquickplugin.so(Qt_6.3)(64bit) libqtwebviewquickplugin.so(Qt_6.4)(64bit) libqtwebviewquickplugin.so(Qt_6.5)(64bit) libqtwebviewquickplugin.so(Qt_6.5.0_PRIVATE_API)(64bit) qt6-webview-imports qt6-webview-imports(aarch-64) qt6qmlimport(QtWebView.1) qt6qmlimport(QtWebView.2) qt6qmlimport(QtWebView.6)"
RDEPENDS:${PN} += "libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libQt6WebViewQuick.so.6()(64bit) libQt6WebViewQuick.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
