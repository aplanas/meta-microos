SUMMARY = "Documentation for texlive-easybook"
DESCRIPTION = "This package includes the documentation for texlive-easybook"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.71dsvn64976"

RPM_NAME = "texlive-easybook-doc-2023.201.1.71dsvn64976-53.1.noarch.rpm"
RPM_HASH = "cd0d7fdb881d95771b15d4a69b4d942f902fc4f75fc86a4a651df87fd8154dc575b3a403d501478bc0f31d12cd0b4f3b17d2cdeb1e63a2abd546c25f9a525472"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-easybook-doc:zh) texlive-easybook-doc"
RDEPENDS:${PN} += ""

inherit rpm
