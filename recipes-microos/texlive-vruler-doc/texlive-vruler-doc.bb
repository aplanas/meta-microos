SUMMARY = "Documentation for texlive-vruler"
DESCRIPTION = "This package includes the documentation for texlive-vruler"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.3svn21598"

RPM_NAME = "texlive-vruler-doc-2023.201.2.3svn21598-53.1.noarch.rpm"
RPM_HASH = "2a7e9d5097620a0ec93c97968b37154bd890ce4146410f6235b82dea3a2aebeb49ef523342f04b5b21b24ea8f981aa89e7c7dc131fe607daf189566b36f7f2e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-vruler-doc"
RDEPENDS:${PN} += ""

inherit rpm
