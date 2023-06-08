SUMMARY = "Easy basic book class, built on memoir"
DESCRIPTION = "The willowtreebook class is a simple book class, which the \
author uses for his lecture notes to be found on his web page \
Benjamin McKay. It actually just selects options for the more \
sophisticated memoir class."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.03svn60638"

RPM_NAME = "texlive-willowtreebook-2023.201.1.03svn60638-53.1.noarch.rpm"
RPM_HASH = "138a39df55e4bae21d7e59d129172ae700781e481746ece3603bdd04d77e175924ca2b2f493910b4267c822642297ec720f60e17583f293fb7d8e11d5ed82fe9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(willowtreebook.cls) texlive-willowtreebook"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(CJKutf8.sty) tex(amsmath.sty) tex(amssymb.sty) tex(amsthm.sty) tex(braket.sty) tex(cfr-lm.sty) tex(colortbl.sty) tex(embrac.sty) tex(enumitem.sty) tex(etex.sty) tex(eucal.sty) tex(fontenc.sty) tex(inputenc.sty) tex(isomath.sty) tex(lmodern.sty) tex(longtable.sty) tex(mathtools.sty) tex(memhfixc.sty) tex(memoir.cls) tex(multicol.sty) tex(newunicodechar.sty) tex(tcolorbox.sty) tex(varioref.sty) tex(xcolor.sty) tex(xparse.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
