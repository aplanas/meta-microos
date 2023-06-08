SUMMARY = "Documentation for qt6-positioning in HTML format"
DESCRIPTION = "This package contains documentation for qt6-positioning in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-positioning-docs-html-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "4562d45899320250ac1aff61e7f93cff8cb9d6330e0fd701a025c6223b9dab0d1fb9f217c853379b3b10c5c12e55bc729ab9af7fb33691e50b1b4db6622bfba8"

RPROVIDES:${PN} += "qt6-location-docs-html qt6-positioning-docs-html qt6-positioning-docs-html(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
