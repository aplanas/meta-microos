SUMMARY = "Documentation for qt6-networkauth in HTML format"
DESCRIPTION = "This package contains documentation for qt6-networkauth in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-networkauth-docs-html-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "69deaf4561b4b86108da5b4a019444ecfeb836ddfddba4df4d8b31db1af8bd18dc551ad680b56c42cd165328bd40e8db9fdc1c85837d0a18ff0a568dcbd21bdd"

RPROVIDES:${PN} += "qt6-networkauth-docs-html qt6-networkauth-docs-html(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
