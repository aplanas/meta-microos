SUMMARY = "Documentation for qt6-location in HTML format"
DESCRIPTION = "This package contains documentation for qt6-location in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-location-docs-html-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "10b6b7b0c995e0550c027c3ce34f541417f63a0cfde5b13f392882cdc723e5d0e6668f73d5c3e99e8884c45f2c818c1de0bf7e6a033e8a2503b6f2883bf07246"

RPROVIDES:${PN} += "qt6-location-docs-html qt6-location-docs-html(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
