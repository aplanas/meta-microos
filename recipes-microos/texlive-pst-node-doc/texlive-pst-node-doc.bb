SUMMARY = "Documentation for texlive-pst-node"
DESCRIPTION = "This package includes the documentation for texlive-pst-node"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.43svn61838"

RPM_NAME = "texlive-pst-node-doc-2023.201.1.43svn61838-52.1.noarch.rpm"
RPM_HASH = "5f9aa8b0457758ff3526f06c43146b731807efe1b75f23fcb5fbdba794e9ee1facc74532a142d8606dbf72340a0e172bb93f4f96ac8c649199e79d474f9bdc68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-pst-node-doc:en) texlive-pst-node-doc"
RDEPENDS:${PN} += ""

inherit rpm
