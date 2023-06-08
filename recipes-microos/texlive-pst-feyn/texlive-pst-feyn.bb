SUMMARY = "Draw graphical elements for Feynman diagrams"
DESCRIPTION = "pst-feyn is a set of drawing graphical elements which are used \
for Feynman diagrams. The package is based on the macros of the \
old package axodraw but uses the capabilities of PSTricks."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.01svn48781"

RPM_NAME = "texlive-pst-feyn-2023.201.0.0.01svn48781-52.1.noarch.rpm"
RPM_HASH = "43d1a3c6018d591e14a08ed864130987de9e03b8659c084e3fd5cff38c011025237fcb5570ce196b6d892aae18e9f96702f23d30cf40b1f4dd16c36bddeb4768"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pst-feyn.sty) tex(pst-feyn.tex) texlive-pst-feyn"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(pstricks.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
