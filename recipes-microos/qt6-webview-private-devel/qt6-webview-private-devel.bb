SUMMARY = "Non-ABI stable API for the Qt 6 WebView library"
DESCRIPTION = "This package provides private headers of libQt6WebView that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-webview-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "77261d3288dd8ae8da2af9f9737a106f76cf4d7f498b9ce5b7477ccef68d844172323c902c6fa3d0fac1bdef4b55439da17a323f388444f29d63981d6a680c79"

RPROVIDES:${PN} += "qt6-webview-private-devel qt6-webview-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6WebView) qt6-gui-private-devel"

inherit rpm
