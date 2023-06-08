SUMMARY = "Documentation for qt6-tools in HTML format"
DESCRIPTION = "This package contains documentation for qt6-tools in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-tools-docs-html-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "85dae8b26c3e7438eb24d2a4d1af5f65c2a33a3435e13f88966759e664fc55e67f9645fb29452781542cfe78f47d8f56876c9bd13653f72bc1715b8cc2d0fddc"

RPROVIDES:${PN} += "qt6-tools-docs-html qt6-tools-docs-html(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
