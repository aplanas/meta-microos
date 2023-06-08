SUMMARY = "Geneva School of Economics and Management PhD thesis format"
DESCRIPTION = "The class provides a PhD thesis template for the Geneva School \
of Economics and Management (GSEM), University of Geneva, \
Switzerland. The class provides utilities to easily set up the \
cover page, the front matter pages, the page headers, etc., \
conformant to the official guidelines of the GSEM Faculty for \
writing PhD dissertations."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.9.4svn56291"

RPM_NAME = "texlive-gsemthesis-2023.201.0.0.9.4svn56291-53.1.noarch.rpm"
RPM_HASH = "a7f62375869b2285be2bd4d8dd14b2eef7a23d3df292dc22dfcfeb48bc1c170440df3fced2f1e8850001248d136da99c61706142ca39614e1184f5e8b19b71ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(gsemthesis.cls) texlive-gsemthesis"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(amsfonts.sty) tex(amsmath.sty) tex(amssymb.sty) tex(babel.sty) tex(book.cls) tex(csquotes.sty) tex(datetime.sty) tex(etoolbox.sty) tex(fancyhdr.sty) tex(float.sty) tex(fontenc.sty) tex(geometry.sty) tex(graphicx.sty) tex(hyperref.sty) tex(inputenc.sty) tex(lmodern.sty) tex(setspace.sty) tex(subfigure.sty) tex(url.sty) tex(xcolor.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
