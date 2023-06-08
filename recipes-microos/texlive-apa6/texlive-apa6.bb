SUMMARY = "Format documents in APA style (6th edition)"
DESCRIPTION = "The class formats documents in APA style (6th Edition). It \
provides a full set of facilities in three different output \
modes (journal-like appearance, double-spaced manuscript, \
LaTeX-like document), in contrast to the earlier apa6e, which \
only formats double-spaced manuscripts in APA style. The class \
can mask author identity for copies for use in masked peer \
review. The class is a development of the apa class (which is \
no longer maintained)."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.34svn53406"

RPM_NAME = "texlive-apa6-2023.201.2.34svn53406-54.1.noarch.rpm"
RPM_HASH = "4d86e7a4c967d244488bf90627b9c500482cc264a5880d9f83dd78e6d8310f7934febf34e8e15322e8853c35b71692bd9bc0eb46f070c6d279ca4546cca7380d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(APAendfloat.cfg) tex(apa6.cls) texlive-apa6"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(apacite.sty) tex(array.sty) tex(article.cls) tex(babel.sty) tex(biblatex.sty) tex(bm.sty) tex(booktabs.sty) tex(caption.sty) tex(draftwatermark.sty) tex(endfloat.sty) tex(etoolbox.sty) tex(fancyhdr.sty) tex(float.sty) tex(flushend.sty) tex(fontenc.sty) tex(ftnright.sty) tex(geometry.sty) tex(graphicx.sty) tex(lmodern.sty) tex(longtable.sty) tex(mathptm.sty) tex(pslatex.sty) tex(substr.sty) tex(threeparttable.sty) tex(times.sty) tex(txfonts.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
