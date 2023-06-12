SUMMARY = "A class for theses at University of Brasilia (UnB)"
DESCRIPTION = "This package provides a class based on abnTeX and compatible \
with pdflatex and biber to prepare bachelor, master, and \
doctoral theses for the University of Brasilia (UnB), Brazil. \
The class also comes with a template for the various types of \
theses for undergraduate and graduate programs at UnB. The \
documentation for the class and the comments in the templates \
are all written in Portuguese, the language of the target \
audience."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn64634"

RPM_NAME = "texlive-unbtex-2023.201.1.2svn64634-53.1.noarch.rpm"
RPM_HASH = "74fc2b5a4df2d2b55263d1bd954d416fe1ff8f5767179b83f244a137b211aef87b0c80945e7d4eb75903b2301b0696b0ee36c2b4394d1acb83aef42534ab7c56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(unbtex.cls) \
texlive-unbtex"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(abntex2.cls) \
tex(algorithm.sty) \
tex(algpseudocode.sty) \
tex(amsfonts.sty) \
tex(amsmath.sty) \
tex(amsthm.sty) \
tex(caption.sty) \
tex(eso-pic.sty) \
tex(fontenc.sty) \
tex(graphicx.sty) \
tex(helvet.sty) \
tex(icomma.sty) \
tex(indentfirst.sty) \
tex(inputenc.sty) \
tex(listings.sty) \
tex(mathrsfs.sty) \
tex(mathtools.sty) \
tex(mdframed.sty) \
tex(microtype.sty) \
tex(multirow.sty) \
tex(stix2.sty) \
tex(subcaption.sty) \
tex(tikz.sty) \
tex(xcolor.sty) \
tex(xstring.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
