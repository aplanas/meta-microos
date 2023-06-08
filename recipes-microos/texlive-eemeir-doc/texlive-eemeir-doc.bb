SUMMARY = "Documentation for texlive-eemeir"
DESCRIPTION = "This package includes the documentation for texlive-eemeir"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1bsvn15878"

RPM_NAME = "texlive-eemeir-doc-2023.201.1.1bsvn15878-53.1.noarch.rpm"
RPM_HASH = "728dd4a4cbca13952833d76acf2f619f595042fc096ec9c9de320de0594b2911530d4ed9e8331e3a234852265af224370d54f7a8f472642eb4195ae6f776bf62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eemeir-doc"
RDEPENDS:${PN} += ""

inherit rpm
