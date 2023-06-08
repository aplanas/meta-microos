SUMMARY = "Documentation for texlive-coop-writing"
DESCRIPTION = "This package includes the documentation for texlive-coop-writing"
LICENSE = "LPPL-1.0"

PV = "2023.204.1.2.4svn61607"

RPM_NAME = "texlive-coop-writing-doc-2023.204.1.2.4svn61607-54.1.noarch.rpm"
RPM_HASH = "e1a91103e9a2d10bb96b972d7bb5313e9dc21331122632cd621f6cefa93263dfe499178958fb0c7f4ad6996f1431625d41f665670ac4a1090309adcd53ec6179"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-coop-writing-doc"
RDEPENDS:${PN} += ""

inherit rpm
