SUMMARY = "Documentation for texlive-chemgreek"
DESCRIPTION = "This package includes the documentation for texlive-chemgreek"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1asvn53437"

RPM_NAME = "texlive-chemgreek-doc-2023.201.1.1asvn53437-53.1.noarch.rpm"
RPM_HASH = "d6d0094b65ba2da92afdded942364082c7860c82c1c4136bad55fe9a52587525d580130ceb65875c59b73ea7d986bbed39cf71ce56e57bd951c5bb45e570b9b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chemgreek-doc"
RDEPENDS:${PN} += ""

inherit rpm
