SUMMARY = "Documentation for qt6-imageformats in HTML format"
DESCRIPTION = "This package contains documentation for qt6-imageformats in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-imageformats-docs-html-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "51feaae982c0d346d1dc46037bdd404120c13c9e6845e6e1462825ff9ac3cc0dcee993d19c6a5ea0662af0b25443f104c573088d00b998b744d563ecd2e96b47"

RPROVIDES:${PN} += "qt6-imageformats-docs-html qt6-imageformats-docs-html(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
