SUMMARY = "Create beautifully typeset sign charts"
DESCRIPTION = "The package allows users to easily typeset beautiful looking \
sign charts directly into their (La)TeX document."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.01svn39707"

RPM_NAME = "texlive-signchart-2023.201.1.01svn39707-53.1.noarch.rpm"
RPM_HASH = "213bafbf686414ffa0e63cb23223157977602d8f1a3fe78ec20a3588d8961f489686f2bca48a6b9d56f2b5653dd56ae34e6cc18196acc0ba5c8762812e45c225"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(signchart.sty) texlive-signchart"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(pgfplots.sty) tex(tikz.sty) tex(xkeyval.sty) tex(xstring.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
