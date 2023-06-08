SUMMARY = "Qt 6 WebView library - Development files"
DESCRIPTION = "Development files for the Qt 6 WebView library"
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-webview-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "e326d0a3371fbb540f3e5d473064bc039f58419130ec030ac7cb804bba50cfd1beb96f8f9fb4dbb77e398f94aa947fe01093a8d1f146bee975c320aff76fb41a"

RPROVIDES:${PN} += "cmake(Qt6WebView) pkgconfig(Qt6WebView) qt6-webview-devel qt6-webview-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Gui) libQt6WebView6 pkgconfig(Qt6Core) pkgconfig(Qt6Gui)"

inherit rpm
