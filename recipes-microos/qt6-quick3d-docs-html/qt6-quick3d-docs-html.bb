SUMMARY = "Documentation for qt6-quick3d in HTML format"
DESCRIPTION = "This package contains documentation for qt6-quick3d in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-quick3d-docs-html-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "06c5577918cf67e300f4c44699f017826f8b891d36c17632b4b8c69df3f4ba3328fcb22dde2ad6f80c52fb12465e670f5cbad6f6de3c27207f8c5da56b02a173"

RPROVIDES:${PN} += "qt6-quick3d-docs-html qt6-quick3d-docs-html(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
