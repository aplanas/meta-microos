SUMMARY = "Draw 3-dimensional framed boxes using PSTricks"
DESCRIPTION = "A package using PSTricks to draw three dimensional framed boxes \
using a macro \\PstFrameBoxThreeD. The macro is especially \
useful for drawing 3d-seeming buttons."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.10svn15878"

RPM_NAME = "texlive-pst-fr3d-2023.201.1.10svn15878-52.1.noarch.rpm"
RPM_HASH = "096c7bc0e355008f97be4f1e5aa1c3b3d8788518c7ab87199902661322a60d43baabb2f1e527d60ac3f601efb79503043f730013e7436009ff58f27c9b6c7350"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pst-fr3d.sty) \
tex(pst-fr3d.tex) \
texlive-pst-fr3d"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
