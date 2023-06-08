SUMMARY = "Documentation for texlive-tex-gyre-math"
DESCRIPTION = "This package includes the documentation for texlive-tex-gyre-math"
LICENSE = "LPPL-1.3c"

PV = "2023.201.svn41264"

RPM_NAME = "texlive-tex-gyre-math-doc-2023.201.svn41264-54.1.noarch.rpm"
RPM_HASH = "c1959d57d6b20c5adf8775f2705e9493e0af787b01556bbc2d2b396eb0fa87d11723b8d803605d239a1b0155c4114c00287205106c0097e78a07725dd7674dee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tex-gyre-math-doc"
RDEPENDS:${PN} += ""

inherit rpm
