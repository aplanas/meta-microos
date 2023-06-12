SUMMARY = "Qt 6 WebView QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 WebView module"
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-webview-imports-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "e948d5cf4cada81bec9989f6693d15a6bb72f5e1241437fe0da2755be6058d26c52b58ebdbc3aaaf34e3271169e291a19c988ca49a4d2b60c09a5efc4bbd8025"

RPROVIDES:${PN} += "libqtwebviewquickplugin.so()(64bit) libqtwebviewquickplugin.so(Qt_6)(64bit) libqtwebviewquickplugin.so(Qt_6.0)(64bit) libqtwebviewquickplugin.so(Qt_6.1)(64bit) libqtwebviewquickplugin.so(Qt_6.2)(64bit) libqtwebviewquickplugin.so(Qt_6.3)(64bit) libqtwebviewquickplugin.so(Qt_6.4)(64bit) libqtwebviewquickplugin.so(Qt_6.5)(64bit) libqtwebviewquickplugin.so(Qt_6.5.1_PRIVATE_API)(64bit) qt6-webview-imports qt6-webview-imports(aarch-64) qt6qmlimport(QtWebView.1) qt6qmlimport(QtWebView.2) qt6qmlimport(QtWebView.6)"
RDEPENDS:${PN} += "libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libQt6WebViewQuick.so.6()(64bit) libQt6WebViewQuick.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
