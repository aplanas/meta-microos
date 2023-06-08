SUMMARY = "Documentation for texlive-subdepth"
DESCRIPTION = "This package includes the documentation for texlive-subdepth"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn15878"

RPM_NAME = "texlive-subdepth-doc-2023.201.0.0.1svn15878-57.1.noarch.rpm"
RPM_HASH = "c34c1e330a426d789de380414c6eb992277df8189fcabc1108efb8da0a62a155198aa6a2a9eba0c6f68a6a839061174ce5ad165d578df98a64881193c2da06ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-subdepth-doc"
RDEPENDS:${PN} += ""

inherit rpm
