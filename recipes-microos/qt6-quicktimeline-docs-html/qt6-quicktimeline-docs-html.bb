SUMMARY = "Documentation for qt6-quicktimeline in HTML format"
DESCRIPTION = "This package contains documentation for qt6-quicktimeline in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quicktimeline-docs-html-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "e2c52a6424e09ffa6d0d6f2516bd2ba5c4f5ba7bcd5c0014e3b1fe0b6492c66c576cb837ac5279639b9492f65751ab3511739cd6af3442f1e4c2cefba8a865a3"

RPROVIDES:${PN} += "qt6-quicktimeline-docs-html qt6-quicktimeline-docs-html(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
