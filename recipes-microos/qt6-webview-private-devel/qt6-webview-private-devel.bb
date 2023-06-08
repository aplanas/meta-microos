SUMMARY = "Non-ABI stable API for the Qt 6 WebView library"
DESCRIPTION = "This package provides private headers of libQt6WebView that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-webview-private-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "9525492b01576457f2cfa96b0d10b6077eec4bcd79fd299212e7295d919a6039ff107a586228ceb296d1df51159d0c40e3ff85c521c073175650635a2836bfe2"

RPROVIDES:${PN} += "qt6-webview-private-devel qt6-webview-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6WebView) qt6-gui-private-devel"

inherit rpm
