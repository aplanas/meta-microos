SUMMARY = "Documentation for texlive-tui"
DESCRIPTION = "This package includes the documentation for texlive-tui"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.9svn27253"

RPM_NAME = "texlive-tui-doc-2023.201.1.9svn27253-52.1.noarch.rpm"
RPM_HASH = "d2dae9a585a092a743378895516b381f010d0933e524d2e9f38e60b370c34f8e5b2a779e23bf6cfdb341311e4fa78266129fec6ffab0ca264c7f17278d568f03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-tui-doc:en;es) \
texlive-tui-doc"
RDEPENDS:${PN} += ""

inherit rpm
