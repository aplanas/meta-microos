SUMMARY = "Documentation for texlive-yamlvars"
DESCRIPTION = "This package includes the documentation for texlive-yamlvars"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn64949"

RPM_NAME = "texlive-yamlvars-doc-2023.201.svn64949-52.1.noarch.rpm"
RPM_HASH = "2af2498087b58a3e1225b59609d8cda162f8e25e10339211b79da47fa4fecefe2919f542dd8b1548b583b21d2c8d1ba7d6850b86eca812558919b95d3fb68073"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-yamlvars-doc"
RDEPENDS:${PN} += ""

inherit rpm
