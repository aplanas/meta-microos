SUMMARY = "Documentation for texlive-bpolynomial"
DESCRIPTION = "This package includes the documentation for texlive-bpolynomial"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5svn15878"

RPM_NAME = "texlive-bpolynomial-doc-2023.201.0.0.5svn15878-52.1.noarch.rpm"
RPM_HASH = "fb0badc3fceb7cd48e5487b844790140e1698ba396056842fc56d84705ccb2eb61e072f5d831afcf6adf0a4049fb95619d87b47ad3c9223c66645e834b314a99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bpolynomial-doc"
RDEPENDS:${PN} += ""

inherit rpm
