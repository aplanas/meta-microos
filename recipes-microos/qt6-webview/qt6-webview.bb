SUMMARY = "Qt 6 WebView library"
DESCRIPTION = "Qt WebView lets you display web content inside a QML application. To avoid \
including a full web browser stack, Qt WebView uses native APIs where \
appropriate."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-webview-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "ab6355ce59944c205ed39b35d219dad627c1a566403bff5dd4756075ab43963358955bad1b752d75923a2c9964d414fefca3ef4fbfa79054ab6654c2c188d220"

RPROVIDES:${PN} += "libqtwebview_webengine.so()(64bit) libqtwebview_webengine.so(Qt_6)(64bit) libqtwebview_webengine.so(Qt_6.0)(64bit) libqtwebview_webengine.so(Qt_6.1)(64bit) libqtwebview_webengine.so(Qt_6.2)(64bit) libqtwebview_webengine.so(Qt_6.3)(64bit) libqtwebview_webengine.so(Qt_6.4)(64bit) libqtwebview_webengine.so(Qt_6.5)(64bit) libqtwebview_webengine.so(Qt_6.5.0_PRIVATE_API)(64bit) qt6-webview qt6-webview(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Network.so.6()(64bit) libQt6Network.so.6(Qt_6)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libQt6Quick.so.6()(64bit) libQt6Quick.so.6(Qt_6)(64bit) libQt6WebEngineCore.so.6()(64bit) libQt6WebEngineCore.so.6(Qt_6)(64bit) libQt6WebEngineQuick.so.6()(64bit) libQt6WebEngineQuick.so.6(Qt_6)(64bit) libQt6WebEngineQuick.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6WebView.so.6()(64bit) libQt6WebView.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6WebViewQuick.so.6()(64bit) libQt6WebViewQuick.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
