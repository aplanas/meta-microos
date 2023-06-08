SUMMARY = "Creating crossword grids, using TikZ"
DESCRIPTION = "The package produces crossword grids, using a wide variety of \
colours and decorations of the grids and the text in them. The \
package uses TikZ for its graphical output."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.03svn32313"

RPM_NAME = "texlive-pas-crosswords-2023.201.1.03svn32313-51.1.noarch.rpm"
RPM_HASH = "bf3f54ed1999a4b56794bca25f25667cce4e4039e2e33151867e4f1bf53b1bdd1ae4ca8641a69c2c904fdeb973c7fca287471a2d0a87a7d589a47f431aa5f043"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pas-crosswords.sty) texlive-pas-crosswords"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(fp.sty) tex(multido.sty) tex(tikz.sty) tex(xkeyval.sty) tex(xstring.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
