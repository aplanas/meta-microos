SUMMARY = "Draw beautiful Pascal (Yanghui) triangles"
DESCRIPTION = "This LaTeX3 package based on TikZ helps to generate beautiful \
Pascal (Yanghui) triangles. It provides a unique drawing macro \
\\pascal which can generate isosceles or right-angle triangles \
customized by means of different \\pascal macro options or the \
\\pascalset macro."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.1svn61774"

RPM_NAME = "texlive-pascaltriangle-2023.201.1.0.1svn61774-51.1.noarch.rpm"
RPM_HASH = "5967a2dab10d1bd93dbea02b641531c85938c574fd1bc261def1a57b0b531192f301a5baf9802d7939add4d3ba4b3dfcb00ff411e4fe6f691e0ffe9c4b68c939"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pascaltriangle.sty) texlive-pascaltriangle"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(amsmath.sty) tex(etoolbox.sty) tex(expl3.sty) tex(tikz.sty) tex(xparse.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
