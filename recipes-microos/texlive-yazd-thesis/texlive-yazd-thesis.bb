SUMMARY = "A template for the Yazd University"
DESCRIPTION = "This package offers a document class for typesetting theses and \
dissertations at the Yazd University. The class requires use of \
XeLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn61719"

RPM_NAME = "texlive-yazd-thesis-2023.201.0.0.3svn61719-52.1.noarch.rpm"
RPM_HASH = "93494fd5161546691b3caaff5222c5aebba91a59db85040434d29baca8547d3753da349c76bb7e033e63281074cf2c9492f44bb0ec5bdf3955d529c2de6670b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(yazd-thesis.cls) texlive-yazd-thesis"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(amsmath.sty) tex(amssymb.sty) tex(amsthm.sty) tex(array.sty) tex(book.cls) tex(calc.sty) tex(fancyhdr.sty) tex(geometry.sty) tex(graphicx.sty) tex(hyperref.sty) tex(makeidx.sty) tex(multicol.sty) tex(tocbibind.sty) tex(xcolor.sty) tex(zref-perpage.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
