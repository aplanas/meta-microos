SUMMARY = "Documentation for texlive-adforn"
DESCRIPTION = "This package includes the documentation for texlive-adforn"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1bsvn54512"

RPM_NAME = "texlive-adforn-doc-2023.201.1.1bsvn54512-54.1.noarch.rpm"
RPM_HASH = "82853d64b697eec65dd50dffd6b199e5ba91f01fa62f052912bd3a38670e7126bcf70deb7a7bed0b4302395509fb107dd4245ab8180862c18518f7d5298be649"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-adforn-doc"
RDEPENDS:${PN} += ""

inherit rpm
