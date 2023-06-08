SUMMARY = "Draw keys and screen items of several Casio calculators"
DESCRIPTION = "This package defines commands to draw the Casio Graph 35 / \
fx-9750GII calculator (and other models). It can draw the whole \
calculator, or parts of it (individual keys, part of the \
screen, etc.). It was written to typeset documents instructing \
students how to use their calculator."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1.3svn65138"

RPM_NAME = "texlive-graph35-2023.201.0.0.1.3svn65138-53.1.noarch.rpm"
RPM_HASH = "2e85a0d7889bdf1274baecd66d08f369baca3898c7e64a0bb5439ea7ad5ec52271b9f56db7fd59e1b888b50df86b7045291003b480e0377e432dee5f56671e67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(graph35-keys.sty) tex(graph35-pixelart.sty) tex(graph35.sty) texlive-graph35"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(amsbsy.sty) tex(amssymb.sty) tex(etoolbox.sty) tex(letterspace.sty) tex(pgfkeys.sty) tex(pgfopts.sty) tex(pixelart0.sty) tex(sansmath.sty) tex(tikz.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
