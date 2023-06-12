SUMMARY = "Documentation for texlive-struktex"
DESCRIPTION = "This package includes the documentation for texlive-struktex"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.3c_0_g7d3fc5bsvn47931"

RPM_NAME = "texlive-struktex-doc-2023.201.2.3c_0_g7d3fc5bsvn47931-57.1.noarch.rpm"
RPM_HASH = "49d708d98636d915ec03ba11afd258ba9d24f5293e1dce917665e0153a0a34fc9ecddc0ec9b3b6c643635fa74fd93bbeef3327330b0c951bcc78c602153f451d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-struktex-doc:de;en) \
texlive-struktex-doc"
RDEPENDS:${PN} += ""

inherit rpm
