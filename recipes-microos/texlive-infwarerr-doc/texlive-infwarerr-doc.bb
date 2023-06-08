SUMMARY = "Documentation for texlive-infwarerr"
DESCRIPTION = "This package includes the documentation for texlive-infwarerr"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn53023"

RPM_NAME = "texlive-infwarerr-doc-2023.201.1.5svn53023-52.1.noarch.rpm"
RPM_HASH = "80fdfdc6580feaa5ad3f2e883caaf3be2febb93ac0f8c10f0faa323d2d0bf1fca074a70de92da592382303364980d89e1e672b427881e2a54b840a8bdf5f52e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-infwarerr-doc"
RDEPENDS:${PN} += ""

inherit rpm
