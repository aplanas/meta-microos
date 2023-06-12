SUMMARY = "'Aligned' math environments with arrows for comments"
DESCRIPTION = "This package provides an environment WithArrows which is \
similar to the environment aligned of amsmath (and mathtools), \
but gives the possibility to draw arrows on the right side of \
the alignment. These arrows are usually used to give \
explanations concerning the mathematical calculus presented. \
The package requires the following other LaTeX packages: expl3, \
footnote, l3keys2e, tikz, and xparse."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.8asvn65841"

RPM_NAME = "texlive-witharrows-2023.201.2.8asvn65841-53.1.noarch.rpm"
RPM_HASH = "9e2ec38c142963fcf84b305105d8f35c847eeba2a1715874eb11d2cbcbe96735550aec7c36735427b2efa830742f7420032d854031688f329a7b5f8ed5c2dd20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(witharrows.sty) \
texlive-witharrows"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(footnote.sty) \
tex(footnotehyper.sty) \
tex(l3keys2e.sty) \
tex(tikz.sty) \
tex(varwidth.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
