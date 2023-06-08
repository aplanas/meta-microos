SUMMARY = "Class for the french journal 'MATAPLI'"
DESCRIPTION = "This is a class for the french journal 'MATAPLI' of the Societe \
de Mathematiques Appliquees et Industrielles (SMAI)."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2.0svn62632"

RPM_NAME = "texlive-matapli-2023.201.1.2.0svn62632-52.1.noarch.rpm"
RPM_HASH = "12154d07e0ea90252ec63c12247984049d5e5a8c9f2e69c5f0b1af3de58ddb6fbf648a9266d509b24a3b80b4d6b4353ec15c6f8858741aad689f4f193f815cc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(matapli.cls) texlive-matapli"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(adjustbox.sty) tex(amssymb.sty) tex(amsthm.sty) tex(babel.sty) tex(bclogo.sty) tex(biblatex.sty) tex(book.cls) tex(booktabs.sty) tex(calc.sty) tex(caption.sty) tex(enumitem.sty) tex(etoc.sty) tex(eurosym.sty) tex(expl3.sty) tex(fancyhdr.sty) tex(geometry.sty) tex(graphicx.sty) tex(iftex.sty) tex(ifthen.sty) tex(latexsym.sty) tex(lettrine.sty) tex(libertine.sty) tex(libertinus-otf.sty) tex(marvosym.sty) tex(mathtools.sty) tex(multicol.sty) tex(subfig.sty) tex(tabularx.sty) tex(tcolorbox.sty) tex(tikz.sty) tex(titlesec.sty) tex(titletoc.sty) tex(url.sty) tex(xcolor.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
