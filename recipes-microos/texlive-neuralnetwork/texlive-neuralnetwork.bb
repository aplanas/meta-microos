SUMMARY = "Graph-drawing for neural networks"
DESCRIPTION = "The package provides facilities for graph-drawing, with \
facilities designed for neural network diagrams."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.0svn31500"

RPM_NAME = "texlive-neuralnetwork-2023.201.1.0svn31500-54.1.noarch.rpm"
RPM_HASH = "e2651e372d1359869c9992c0fe0888d7fe994d6844d92c2527707d2c2982f8ce934a989e40eedf0a173342acc297078b5385d9856da4f1cc78936e154b813f4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(neuralnetwork.sty) \
texlive-neuralnetwork"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(algorithmicx.sty) \
tex(environ.sty) \
tex(etoolbox.sty) \
tex(mathtools.sty) \
tex(tikz.sty) \
tex(xkeyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
