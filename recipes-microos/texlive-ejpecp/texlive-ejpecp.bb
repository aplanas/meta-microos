SUMMARY = "Class for EJP and ECP"
DESCRIPTION = "The class is designed for typesetting articles for the \
mathematical research periodicals Electronic Journal of \
Probability (EJP) and Electronic Communications in Probability \
(ECP). It depends on amsmath, amsfonts, amsthm, bera, dsfont, \
geometry, graphicx, hyperref, lastpage, latexsym, mathtools, \
microtype, and afterpackage."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.11.3svn60950"

RPM_NAME = "texlive-ejpecp-2023.201.1.11.3svn60950-53.1.noarch.rpm"
RPM_HASH = "b1f70fd304c3712aafd97e924c56ea30584be3b5dbbab40ba4c369c1fe86eb44fab0983d18ae3c71eccadb6090fe249418ae5c040e289ac754cf6d4bd02240f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ejpecp.cls) \
texlive-ejpecp"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(afterpackage.sty) \
tex(amsfonts.sty) \
tex(amsmath.sty) \
tex(amssymb.sty) \
tex(amsthm.sty) \
tex(article.cls) \
tex(auto-pst-pdf.sty) \
tex(bera.sty) \
tex(dsfont.sty) \
tex(geometry.sty) \
tex(graphicx.sty) \
tex(hyperref.sty) \
tex(latexsym.sty) \
tex(mathtools.sty) \
tex(microtype.sty) \
tex(pstricks.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
