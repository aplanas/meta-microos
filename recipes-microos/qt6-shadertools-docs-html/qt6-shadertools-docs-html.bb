SUMMARY = "Documentation for qt6-shadertools in HTML format"
DESCRIPTION = "This package contains documentation for qt6-shadertools in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-shadertools-docs-html-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "1d4ffd4e10f9cdecb25d42ce281f769eeeb15bd8adae9e5fda6eef5bd80d2d50b2e0ab98057b4ed52fd87d4ba227f29a5355675c479d92e5d547bd8895ed6703"

RPROVIDES:${PN} += "qt6-shadertools-docs-html qt6-shadertools-docs-html(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
