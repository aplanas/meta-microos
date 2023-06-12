SUMMARY = "Documentation for qt6-scxml in HTML format"
DESCRIPTION = "This package contains documentation for qt6-scxml in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-scxml-docs-html-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "9009a9b7ecb3b3a4f3d2c9303cb9ac400888e2c13ad8b43ba49def5e3a0876db33babbea54b7bac964c88109c6c3a6beba5e7ea6104ec84b6d13ff34e07c51c3"

RPROVIDES:${PN} += "qt6-scxml-docs-html qt6-scxml-docs-html(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
