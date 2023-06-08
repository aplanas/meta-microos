SUMMARY = "Documentation for qt6-opcua in HTML format"
DESCRIPTION = "This package contains documentation for qt6-opcua in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-opcua-docs-html-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "f1d414d70006a85e55cb24ef974d46ec42c2355f94a45d33a58f4ce9643f19bdc51e07920cdcd1ed328a47b13b1c8b00f5a940027b4bf21be506a6e4b1e49b17"

RPROVIDES:${PN} += "qt6-opcua-docs-html qt6-opcua-docs-html(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
