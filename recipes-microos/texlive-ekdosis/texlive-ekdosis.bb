SUMMARY = "Typesetting TEI-xml compliant Critical Editions"
DESCRIPTION = "ekdosis is a LuaLaTeX package designed for multilingual \
critical editions. It can be used to typeset texts and \
different layers of critical notes in any direction accepted by \
LuaTeX. Texts can be arranged in running paragraphs or on \
facing pages, in any number of columns which in turn can be \
synchronized or not. In addition to printed texts, ekdosis can \
convert .tex source files so as to produce TEI xml-compliant \
critical editions. Database-driven encoding under LaTeX then \
allows extraction of texts entered segment by segment according \
to various criteria: main edited text, variant readings, \
translations or annotated borrowings between texts."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.4svn61113"

RPM_NAME = "texlive-ekdosis-2023.201.1.4svn61113-53.1.noarch.rpm"
RPM_HASH = "b125ec2203c69a6cf7d50af8b2c9383c16212eaf484c8d934fc326e1a4719933ad347976b092903d31d8dbda24774b0e33b15d3ba09ac48fea05c2675348879c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ekdosis.sty) texlive-ekdosis"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(etoolbox.sty) tex(expkv-def.sty) tex(expkv-opt.sty) tex(ifoddpage.sty) tex(iftex.sty) tex(keyfloat.sty) tex(lineno.sty) tex(ltxcmds.sty) tex(luacode.sty) tex(paracol.sty) tex(parnotes.sty) tex(pdftexcmds.sty) tex(refcount.sty) tex(tcolorbox.sty) tex(trivfloat.sty) tex(verse.sty) tex(zref-abspage.sty) tex(zref-user.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
