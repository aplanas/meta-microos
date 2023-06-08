SUMMARY = "Commands and document classes for German-speaking teachers of mathematics and physics"
DESCRIPTION = "The schulmathematik bundle provides two LaTeX packages and six \
document classes for German-speaking teachers of mathematics \
and physics."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn64108"

RPM_NAME = "texlive-schulmathematik-2023.201.1.3svn64108-53.1.noarch.rpm"
RPM_HASH = "6f06d8b29f1028fa98d7c9957467714b92735f67f7592e1f44a6d67197895affb39ed73ce8e845b475370d6642260621b11a87bde6a8ddac2cc0869e32041c64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(schulma-ab.cls) tex(schulma-gutachten.cls) tex(schulma-klausur.cls) tex(schulma-komp.cls) tex(schulma-mdlprf.cls) tex(schulma-physik.sty) tex(schulma-praes.cls) tex(schulma.sty) texlive-schulmathematik"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(adjustbox.sty) tex(autoaligne.sty) tex(babel.sty) tex(beamerarticle.sty) tex(comment.sty) tex(datetime2.sty) tex(enumitem.sty) tex(etoolbox.sty) tex(geometry.sty) tex(icomma.sty) tex(isodate.sty) tex(mathtools.sty) tex(pgfpages.sty) tex(pgfplots.sty) tex(scrlayer-scrpage.sty) tex(siunitx.sty) tex(tasks.sty) tex(tikz.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
