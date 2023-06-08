SUMMARY = "Documentation for qt6-coap in HTML format"
DESCRIPTION = "This package contains documentation for qt6-coap in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-coap-docs-html-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "217174ed78eaf1f988236ef8e302d6788118951aecd2967f3442f3b93683f98034b219ae67d03ed0d6c33cd39247a226772e57c190cc298ac64ea4aada4ca4c5"

RPROVIDES:${PN} += "qt6-coap-docs-html qt6-coap-docs-html(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
