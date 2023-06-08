SUMMARY = "Documentation for texlive-labyrinth"
DESCRIPTION = "This package includes the documentation for texlive-labyrinth"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn33454"

RPM_NAME = "texlive-labyrinth-doc-2023.201.1.0svn33454-55.1.noarch.rpm"
RPM_HASH = "ca11f97b0f1f07a7bf988ca935b5e5d85cc21522da8b1f8cb74930b379388787fbe71fedabfabde6729b172aa3b337fdb15748a0a3f6316f12a902d68d0fc11a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-labyrinth-doc"
RDEPENDS:${PN} += ""

inherit rpm
