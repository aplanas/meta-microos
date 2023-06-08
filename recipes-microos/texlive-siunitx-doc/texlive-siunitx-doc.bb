SUMMARY = "Documentation for texlive-siunitx"
DESCRIPTION = "This package includes the documentation for texlive-siunitx"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.2.2svn66365"

RPM_NAME = "texlive-siunitx-doc-2023.201.3.2.2svn66365-57.1.noarch.rpm"
RPM_HASH = "cdad10eb31c71ce4ba15f3a806736aa96945f55cad5343374eaf20f83da61c278af69c1c9091d06fa64d47913917f8a0ee6c2a7d643193c469db24264d7aa1aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-siunitx-doc"
RDEPENDS:${PN} += ""

inherit rpm
