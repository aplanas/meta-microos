SUMMARY = "Documentation for texlive-lm-math"
DESCRIPTION = "This package includes the documentation for texlive-lm-math"
LICENSE = "LPPL-1.3c"

PV = "2023.201.1.959svn36915"

RPM_NAME = "texlive-lm-math-doc-2023.201.1.959svn36915-54.1.noarch.rpm"
RPM_HASH = "a22d2840d76024c8895205656cfd3c3d74c488922d4dfe9acb43147d3779847c64d6dbfffb85c5ada55de900330519e2877838105dc5951dafa31581de9a391d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lm-math-doc"
RDEPENDS:${PN} += ""

inherit rpm
