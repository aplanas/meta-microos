SUMMARY = "Use existing qtree syntax for trees in TikZ"
DESCRIPTION = "The package provides a macro for drawing trees with TikZ using \
the easy syntax of Alexis Dimitriadis' Qtree. It improves on \
TikZ's standard tree-drawing facility by laying out tree nodes \
without collisions; it improves on Qtree by adding lots of \
features from TikZ (for example, edge labels, arrows between \
nodes); and it improves on pst-qtree in being usable with \
pdfTeX and XeTeX."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.2svn26108"

RPM_NAME = "texlive-tikz-qtree-2023.201.1.2svn26108-52.1.noarch.rpm"
RPM_HASH = "62c37a2f124b582082bb6ff121c0edcd38b9409440324d3baae99c5b25349bb832d5f9f74da43c533126a94b980e4f390aa57ac68915d9a48514a6972fb5c387"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pgfsubpic.sty) tex(pgfsubpic.tex) tex(pgftree.sty) tex(pgftree.tex) tex(tikz-qtree-compat.sty) tex(tikz-qtree.sty) tex(tikz-qtree.tex) texlive-tikz-qtree"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(pgf.sty) tex(pgffor.sty) tex(tikz.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
