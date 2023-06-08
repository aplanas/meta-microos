SUMMARY = "Documentation for texlive-fundus-sueterlin"
DESCRIPTION = "This package includes the documentation for texlive-fundus-sueterlin"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn26030"

RPM_NAME = "texlive-fundus-sueterlin-doc-2023.201.1.2svn26030-52.1.noarch.rpm"
RPM_HASH = "1a0326611342a991f875679e19cc5e2a131dce690ba43501caeec7dc13590d32b0de06c1981a8c1fc4bfff56588f837a0876632b848055f03a72afef4d30a2b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fundus-sueterlin-doc"
RDEPENDS:${PN} += ""

inherit rpm
