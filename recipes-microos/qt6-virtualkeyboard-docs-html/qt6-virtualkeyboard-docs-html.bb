SUMMARY = "Documentation for qt6-virtualkeyboard in HTML format"
DESCRIPTION = "This package contains documentation for qt6-virtualkeyboard in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-virtualkeyboard-docs-html-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "36f00956abad4e6944ee9ffbf995a9a08bde311718cb6f9d2653f2ad30a88fbf3c3a3a266623839ece1c7948fdb116f4046c02a40a9cde51a6d313ae5f5c4871"

RPROVIDES:${PN} += "qt6-virtualkeyboard-docs-html qt6-virtualkeyboard-docs-html(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
