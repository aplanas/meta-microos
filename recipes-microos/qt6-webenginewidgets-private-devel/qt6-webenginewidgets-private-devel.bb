SUMMARY = "Non-ABI stable API for the Qt 6 WebEngineWidgets library"
DESCRIPTION = "This package provides private headers of libQt6WebEngineWidgets that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "qt6-webenginewidgets-private-devel-6.5.0-1.2.aarch64.rpm"
RPM_HASH = "84893c58840062f0195bb4329c12e686904c77d5a78b7a92c36efd4a5a965f94ac52386924b83e11841362ed469645bbbfb1da9b2857f118de1f38930cfa56a3"

RPROVIDES:${PN} += "qt6-webenginewidgets-private-devel qt6-webenginewidgets-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6WebEngineWidgets)"

inherit rpm
