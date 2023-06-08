SUMMARY = "Define matrices by given list of values"
DESCRIPTION = "Macros to define and write matrices whose coefficients are \
given row by row in a list of values separated by commas."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.1svn63802"

RPM_NAME = "texlive-simples-matrices-2023.201.1.0.1svn63802-53.1.noarch.rpm"
RPM_HASH = "41f908c0833d56c1ecdd88fe0469ecefa43c669c0e35b6da73992f077956a6d99ce4ae09ef14eed4413f4ee36004338425542198301976690328505b0ddd6940"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(simples-matrices.sty) texlive-simples-matrices"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(amsmath.sty) tex(expl3.sty) tex(l3keys2e.sty) tex(xparse.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
