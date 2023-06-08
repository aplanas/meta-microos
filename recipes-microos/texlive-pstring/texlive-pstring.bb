SUMMARY = "Typeset sequences with justification pointers"
DESCRIPTION = "This package lets you typeset justified sequences, also called \
pointing strings. It's used for instance, in research papers \
about Game Semantics to represent sequence of game moves with \
their associated justification pointers. Depending on wether \
using LaTeX or pdfLaTeX, the package uses PSTricks and pst-node \
respectively pgf/TikZ."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn42857"

RPM_NAME = "texlive-pstring-2023.201.svn42857-53.1.noarch.rpm"
RPM_HASH = "da57ae05cfe67951a1eae2289b5f2b75536292ed2ed68b6123ac23817a0e2162efcb2ac9ad68b8e340f8a06e088481d11c6f863f618055905c7f39f2005bd1ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pstring.sty) texlive-pstring"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(ifpdf.sty) tex(pgfcore.sty) tex(pst-node.sty) tex(pstricks.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
