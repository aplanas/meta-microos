SUMMARY = "Documentation for texlive-phfsvnwatermark"
DESCRIPTION = "This package includes the documentation for texlive-phfsvnwatermark"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn41870"

RPM_NAME = "texlive-phfsvnwatermark-doc-2023.201.1.0svn41870-51.1.noarch.rpm"
RPM_HASH = "285cd5d1f8870dbb5cc1a8ccb61adfe99c7b64703cf9a6bb1bc739c508adfa6d6fdfbd63fba825f470506cf3830d50e548667a82337e847e2df5ab508881bce8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-phfsvnwatermark-doc"
RDEPENDS:${PN} += ""

inherit rpm
