SUMMARY = "Documentation for texlive-he-she"
DESCRIPTION = "This package includes the documentation for texlive-he-she"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn41359"

RPM_NAME = "texlive-he-she-doc-2023.201.1.3svn41359-53.1.noarch.rpm"
RPM_HASH = "7941e25c12d5b0c68e7cf1d67ac58f916cc1c5424def41cd8b0f365906de252142dd8a261d4071fe1829fb56a148b136cd231b15e1a2bd6d39613ba6f4fc458a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-he-she-doc"
RDEPENDS:${PN} += ""

inherit rpm
