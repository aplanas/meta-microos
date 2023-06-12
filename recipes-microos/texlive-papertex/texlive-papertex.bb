SUMMARY = "Class for newspapers, etcetera"
DESCRIPTION = "This class allows LaTeX users to create a paperTeX newspaper. \
The final document has a front page and as many inner pages as \
desired. News items appear one after another and the user can \
choose the number of columns, style and so on. The class allows \
users to create newsletters too."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2bsvn19230"

RPM_NAME = "texlive-papertex-2023.201.1.2bsvn19230-51.1.noarch.rpm"
RPM_HASH = "1f4826368d6ce3166d78cdc487229930610b5d2425330648b7a482f4aaa65e06f8a013c8258e5d8477205fb46e71df3bc51be8e40d225ff50382e32d655c7885"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(papertex.cls) \
texlive-papertex"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(article.cls) \
tex(color.sty) \
tex(datetime.sty) \
tex(fancybox.sty) \
tex(fancyhdr.sty) \
tex(geometry.sty) \
tex(graphicx.sty) \
tex(hyperref.sty) \
tex(hyphenat.sty) \
tex(ifpdf.sty) \
tex(ifthen.sty) \
tex(lastpage.sty) \
tex(multicol.sty) \
tex(multido.sty) \
tex(ragged2e.sty) \
tex(setspace.sty) \
tex(textpos.sty) \
tex(wrapfig.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
