SUMMARY = "Sphinx packages for LaTeX"
DESCRIPTION = "Sphinx is a tool that facilitates creating documentation for Python \
projects (or other documents consisting of multiple reStructuredText \
sources). \
 \
This package contains the LaTeX components for python-Sphinx."
LICENSE = "BSD-2-Clause"

PV = "7.0.0"

RPM_NAME = "python39-Sphinx-latex-7.0.0-1.1.noarch.rpm"
RPM_HASH = "a5867aaf9ac0db4bccd3ba326ba89cc555a47d8be54e448d230e7eecef0302aa8eaf40e796160a2a3c0101da85724eb87a87958bb0d141e649590df5eeebf657"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-Sphinx-latex"
RDEPENDS:${PN} += "python39-Sphinx tex(8r.enc) tex(alltt.sty) tex(amsfonts.sty) tex(amsmath.sty) tex(amssymb.sty) tex(amsthm.sty) tex(anyfontsize.sty) tex(array.sty) tex(article.cls) tex(atbegshi.sty) tex(babel.sty) tex(bm.sty) tex(capt-of.sty) tex(cmap.sty) tex(color.sty) tex(colortbl.sty) tex(dvipdfmx.def) tex(english.ldf) tex(eqparbox.sty) tex(fancybox.sty) tex(fancyhdr.sty) tex(fancyvrb.sty) tex(float.sty) tex(fncychap.sty) tex(fontenc.sty) tex(footnote.sty) tex(framed.sty) tex(graphics.sty) tex(graphicx.sty) tex(hypcap.sty) tex(hyperref.sty) tex(ifthen.sty) tex(inputenc.sty) tex(longtable.sty) tex(luatex85.sty) tex(makeidx.sty) tex(multirow.sty) tex(needspace.sty) tex(newfloat.sty) tex(palatino.sty) tex(parskip.sty) tex(pcrr.tfm) tex(pdftex.def) tex(pdftex.map) tex(phvr.tfm) tex(polyglossia.sty) tex(pplr.tfm) tex(preview.sty) tex(ptmr.tfm) tex(pzcmi.tfm) tex(tabulary.sty) tex(textcomp.sty) tex(tgtermes.sty) tex(threeparttable.sty) tex(times.sty) tex(titlesec.sty) tex(upquote.sty) tex(utf8.def) tex(utf8x.def) tex(varwidth.sty) tex(wrapfig.sty) texlive-dvipng texlive-gnu-freefont texlive-latex texlive-latexmk texlive-makeindex texlive-metafont texlive-pdftex"

inherit rpm
