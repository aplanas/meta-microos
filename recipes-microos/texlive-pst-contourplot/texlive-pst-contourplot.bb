SUMMARY = "Draw implicit functions using the 'marching squares' algorithm"
DESCRIPTION = "This package allows to draw implicit functions 'f(x,y) = 0' \
with options for coloring the inside of the surfaces, for \
marking the points and arrowing the curve at points chosen by \
the user. The package uses the 'marching squares' algorithm."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.6svn48230"

RPM_NAME = "texlive-pst-contourplot-2023.201.0.0.6svn48230-52.1.noarch.rpm"
RPM_HASH = "7f5ee289294020021ad29e00fc75c7a064be609529d7529fa9279e27172d59b100c279f245833a5c518d02030b8de88fad40610d9cc04d33375c5d7f9dfc6ba8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pst-contourplot.sty) tex(pst-contourplot.tex) texlive-pst-contourplot"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(pstricks.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
