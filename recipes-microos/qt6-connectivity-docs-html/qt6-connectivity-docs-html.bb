SUMMARY = "Documentation for qt6-connectivity in HTML format"
DESCRIPTION = "This package contains documentation for qt6-connectivity in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-connectivity-docs-html-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "76386e3fef3cfc748c06d1d752c8bbc20ec1d40b54c407fd07e7a12e3e89d93bba2d99b598f809085b282d1650dddc85961d8dc73c3fb67a34edacd59e584b1f"

RPROVIDES:${PN} += "qt6-connectivity-docs-html qt6-connectivity-docs-html(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
