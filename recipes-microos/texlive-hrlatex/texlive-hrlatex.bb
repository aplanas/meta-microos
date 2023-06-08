SUMMARY = "LaTeX support for Croatian documents"
DESCRIPTION = "This package simplifies creation of new documents for the \
(average) Croatian user. As an example, a class file hrdipl.cls \
(designed for the graduation thesis at the University of \
Zagreb) and sample thesis documents are included."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.23svn18020"

RPM_NAME = "texlive-hrlatex-2023.201.0.0.23svn18020-52.1.noarch.rpm"
RPM_HASH = "a5ecbf0817a7d4635384dbf855126f556aa684e3e89e8b40b2bf21aec68f08e7a4fb41ca3db67ad2fadfcd27f6ab813f0dc73f4dcdd7627f4eef0de6561c7e40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(fsbispit.cls) tex(fsbmath.sty) tex(hrlatex.sty) texlive-hrlatex"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(amsmath.sty) tex(amsopn.sty) tex(amssymb.sty) tex(amsthm.sty) tex(babel.sty) tex(calc.sty) tex(cancel.sty) tex(enumerate.sty) tex(fontenc.sty) tex(framed.sty) tex(graphicx.sty) tex(ifthen.sty) tex(inputenc.sty) tex(multicol.sty) tex(optional.sty) tex(paralist.sty) tex(txfonts.sty) tex(xcolor.sty) tex(xkeyval.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
