SUMMARY = "PLaTeX2e and miscellaneous macros for pTeX"
DESCRIPTION = "The bundle provides pLaTeX2e and miscellaneous macros for pTeX \
and e-pTeX. This is a community edition forked from the \
original ASCII edition (ptex-texmf-2.5)."
LICENSE = "BSD-3-Clause"

PV = "2023.201.svn66186"

RPM_NAME = "texlive-platex-2023.201.svn66186-52.1.noarch.rpm"
RPM_HASH = "d9da62c4a7feaaca7421b90c08fdcff55a1edd6e1798eb7710b02eda1a65aa03c970eabe346d6a8d842bbee0ed5cf97823f34c0e0b6984c26cc50a43c70b00a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(exppl2e.sty) tex(jarticle.cls) tex(jarticle.sty) tex(jbk10.clo) tex(jbk11.clo) tex(jbk12.clo) tex(jbook.cls) tex(jbook.sty) tex(jltxdoc.cls) tex(jreport.cls) tex(jreport.sty) tex(jsize10.clo) tex(jsize11.clo) tex(jsize12.clo) tex(jt1gt.fd) tex(jt1mc.fd) tex(jy1gt.fd) tex(jy1mc.fd) tex(kinsoku.tex) tex(oldpfont.sty) tex(pfltrace.sty) tex(pl209.def) tex(platexrelease.sty) tex(plexpl3.sty) tex(plext.sty) tex(plnews.cls) tex(ptrace.sty) tex(tarticle.cls) tex(tarticle.sty) tex(tbk10.clo) tex(tbk11.clo) tex(tbk12.clo) tex(tbook.cls) tex(tbook.sty) tex(treport.cls) tex(treport.sty) tex(tsize10.clo) tex(tsize11.clo) tex(tsize12.clo) texlive-platex"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(expl3.sty) tex(fltrace.sty) tex(language.dat) tex(language.dat.lua) tex(language.def) tex(latex209.def) tex(latexrelease.sty) tex(ltxdoc.cls) tex(oldlfont.sty) tex(plautopatch.sty) tex(shortvrb.sty) tex(tracefnt.sty) texlive texlive-atbegshi texlive-atveryend texlive-babel texlive-cm texlive-everyshi texlive-filesystem texlive-firstaid texlive-hyphen-base texlive-kpathsea texlive-kpathsea-bin texlive-l3backend texlive-l3kernel texlive-l3packages texlive-latex texlive-latex-base-dev texlive-latex-firstaid-dev texlive-latex-fonts texlive-platex-bin texlive-ptex texlive-ptex-fonts texlive-scripts texlive-scripts-bin texlive-tex-ini-files texlive-unicode-data texlive-uptex"

inherit rpm
