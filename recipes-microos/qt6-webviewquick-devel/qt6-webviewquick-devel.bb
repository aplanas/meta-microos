SUMMARY = "Qt 6 WebViewQuick library - Development files"
DESCRIPTION = "Development files for the Qt 6 WebViewQuick library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-webviewquick-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "bd2f8b38af93ff9db4397674b5d2dce0515370706f1eda46adab62cfd1581982e5d86583775cae623ae4ae2860eda004cfed44358db90e9d55079f77a4ed4d3a"

RPROVIDES:${PN} += "cmake(Qt6WebViewQuick) pkgconfig(Qt6WebViewQuick) qt6-webviewquick-devel qt6-webviewquick-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6OpenGL) cmake(Qt6QmlModels) cmake(Qt6Quick) libQt6WebViewQuick6 pkgconfig(Qt6OpenGL) pkgconfig(Qt6QmlModels) pkgconfig(Qt6Quick) qt6-webview-private-devel"

inherit rpm
