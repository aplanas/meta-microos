SUMMARY = "Documentation for texlive-tree-dvips"
DESCRIPTION = "This package includes the documentation for texlive-tree-dvips"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.91svn21751"

RPM_NAME = "texlive-tree-dvips-doc-2023.201.0.0.91svn21751-52.1.noarch.rpm"
RPM_HASH = "4fd63ab0b61a70a47ca3ea091082e2f7d7b6145077080bfe4447a71218856eb17b6c1d9085fc9f3d015d7467bbd2cbe99b05ee5914d187b654db00836cca7efc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tree-dvips-doc"
RDEPENDS:${PN} += ""

inherit rpm
