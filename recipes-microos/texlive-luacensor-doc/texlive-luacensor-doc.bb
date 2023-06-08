SUMMARY = "Documentation for texlive-luacensor"
DESCRIPTION = "This package includes the documentation for texlive-luacensor"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1.0svn62167"

RPM_NAME = "texlive-luacensor-doc-2023.201.1.1.0svn62167-52.1.noarch.rpm"
RPM_HASH = "25a23b61447e06baefddc96f77ee138b5a4d1835978d911eb1f3a647dc1192fe5a5e29220247846011a070692c88fe40a03c9b8c5fb52334d3937cdd4331ac7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luacensor-doc"
RDEPENDS:${PN} += ""

inherit rpm
