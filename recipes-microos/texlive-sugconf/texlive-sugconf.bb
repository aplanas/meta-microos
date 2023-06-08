SUMMARY = "SAS(R) user group conference proceedings document class"
DESCRIPTION = "The class may be used to typeset articles to be published in \
the proceedings of SAS(R) User group conferences and workshops. \
The layout produced by the class is based on that published by \
SAS Institute (2021)."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn58752"

RPM_NAME = "texlive-sugconf-2023.201.svn58752-57.1.noarch.rpm"
RPM_HASH = "df0ce949e4d989ed7ab3dba1996fc129def0b64e8d61e3513ac341d7d60a1394c8cffca3332dcf7f38a61d9536be91c5d857af3ef5d064ce509d68a33d027a5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(sugconf.cls) texlive-sugconf"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(article.cls) tex(fontenc.sty) tex(graphicx.sty) tex(ifthen.sty) tex(inputenc.sty) tex(url.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
