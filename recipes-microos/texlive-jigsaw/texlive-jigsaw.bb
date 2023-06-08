SUMMARY = "Draw jigsaw pieces with TikZ"
DESCRIPTION = "This is a small LaTeX package to draw jigsaw pieces with TikZ. \
It is possible to draw individual pieces and adjust their \
shape, create tile patterns or automatically generate complete \
jigsaws."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4svn66009"

RPM_NAME = "texlive-jigsaw-2023.201.0.0.4svn66009-55.1.noarch.rpm"
RPM_HASH = "3776b5fc57f976dd1cdf922ac6c2afacabfbe9e0e3e029ffe3af78d0858ea09e9e3c6ebf408f505dd80458f9f006cf1516e620ff3b810a08dd0df4ead34c789b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(jigsaw.sty) texlive-jigsaw"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(ifluatex.sty) tex(ifxetex.sty) tex(tikz.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
