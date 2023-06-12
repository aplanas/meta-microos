SUMMARY = "Documentation for qt6-websockets in HTML format"
DESCRIPTION = "This package contains documentation for qt6-websockets in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-websockets-docs-html-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "1b932216c4fba81c96ada668395dc4a1e8be562f6570b90b47d1471983899c9f41c12c309234e45da1391256fe3ce40bb14a7645e4826b92b5afc38c7b4fb534"

RPROVIDES:${PN} += "qt6-websockets-docs-html \
qt6-websockets-docs-html(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
