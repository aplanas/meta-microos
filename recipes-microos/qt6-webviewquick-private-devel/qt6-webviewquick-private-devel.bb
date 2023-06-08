SUMMARY = "Non-ABI stable API for the Qt 6 WebViewQuick library"
DESCRIPTION = "This package provides private headers of libQt6WebViewQuick that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-webviewquick-private-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "4bdde4e156c6db182b885e5c8008abb645e71215ab0fd8c8ec38f1ca2d0069d86d5010845b7b4c4fdb93e03c2c7f4878857733c2cb989fad1287c494bf75508e"

RPROVIDES:${PN} += "qt6-webviewquick-private-devel qt6-webviewquick-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6WebViewQuick)"

inherit rpm
