SUMMARY = "Documentation for texlive-mercatormap"
DESCRIPTION = "This package includes the documentation for texlive-mercatormap"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.02svn56060"

RPM_NAME = "texlive-mercatormap-doc-2023.201.1.02svn56060-54.1.noarch.rpm"
RPM_HASH = "e8b3659af97a4b4b4cdbf023fa0967811e2d680963b1e20aa0d7d37f2f0886f78a767432d80ac0da801e762ffb26a2bd1a385eb99c077dd17b38ccd14920565e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mercatormap-doc"
RDEPENDS:${PN} += ""

inherit rpm
