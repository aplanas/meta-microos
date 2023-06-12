SUMMARY = "Documentation for qt6-declarative in HTML format"
DESCRIPTION = "This package contains documentation for qt6-declarative in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-declarative-docs-html-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "99f7f52dc14abcbdeecc70aa43f719546464a8cddbfbc521bf2b24a571dee16a96ce2f3d5542d37b0957f40aa8ee880a71859bc66276e2a6a0ad14c02aa2de25"

RPROVIDES:${PN} += "qt6-declarative-docs-html qt6-declarative-docs-html(aarch-64) qt6-quickcontrols2-docs-html"
RDEPENDS:${PN} += ""

inherit rpm
