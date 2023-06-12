SUMMARY = "Class for typesetting articles for the ICSV conference"
DESCRIPTION = "This is an ad-hoc class for typesetting articles for the ICSV \
conference, based on the earler active-conf by the same author."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn15878"

RPM_NAME = "texlive-icsv-2023.201.0.0.2svn15878-52.1.noarch.rpm"
RPM_HASH = "19ca7fa7ce7dc3b239fc48bd541c4ccf79ff90668d6b92d8fc16e71e81eeafb1b7da473b03bfe366f9224aa4e7c57a8f7557e9b185dda09831538cbc8de17737"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(icsv.cls) \
texlive-icsv"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amsmath.sty) \
tex(amssymb.sty) \
tex(array.sty) \
tex(article.cls) \
tex(bm.sty) \
tex(calc.sty) \
tex(caption.sty) \
tex(fancyhdr.sty) \
tex(fix-cm.sty) \
tex(fixltx2e.sty) \
tex(fontenc.sty) \
tex(geometry.sty) \
tex(graphicx.sty) \
tex(helvet.sty) \
tex(hyperref.sty) \
tex(ifthen.sty) \
tex(textcomp.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
