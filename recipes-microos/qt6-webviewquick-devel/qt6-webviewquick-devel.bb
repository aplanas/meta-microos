SUMMARY = "Qt 6 WebViewQuick library - Development files"
DESCRIPTION = "Development files for the Qt 6 WebViewQuick library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-webviewquick-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "f4f604ac836103a8dd3793cb654848756d3c254d71f7e3905255e03124b4f68514c35b9138361d098b1e7a8e7014e3d6aafbc5b3dd1f2dbcefea9b2a94d66ff1"

RPROVIDES:${PN} += "cmake(Qt6WebViewQuick) pkgconfig(Qt6WebViewQuick) qt6-webviewquick-devel qt6-webviewquick-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6OpenGL) cmake(Qt6QmlModels) cmake(Qt6Quick) libQt6WebViewQuick6 pkgconfig(Qt6OpenGL) pkgconfig(Qt6QmlModels) pkgconfig(Qt6Quick) qt6-webview-private-devel"

inherit rpm
