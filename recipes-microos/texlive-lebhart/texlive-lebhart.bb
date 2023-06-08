SUMMARY = "Write your articles in a colorful way"
DESCRIPTION = "This package provides a LaTeX class for typesetting articles \
with a colorful design. Currently, it has native support for \
Chinese (simplified and traditional), English, French, German, \
Italian, Japanese, Portuguese (European and Brazilian), Russian \
and Spanish typesetting. It compiles with either XeLaTeX or \
LuaLaTeX. This is part of the colorist class series and depends \
on colorist.sty from the colorist package. The package name \
'lebhart' is taken from the German word 'lebhaft' ('vivid'), \
combined with the first three letters of 'Artikel' ('article')."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn65475"

RPM_NAME = "texlive-lebhart-2023.201.svn65475-54.1.noarch.rpm"
RPM_HASH = "ff7e6269c534ca2750ffde6e993eae7e8c92c1ffda3fc387310f085031ac7e6516a50d506c571b2e623455780ed389a15f4d7038c84556cffd2ed69ec6fce49f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(lebhart.cls) texlive-lebhart"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(amssymb.sty) tex(caption.sty) tex(colorist.sty) tex(ctex.sty) tex(draftwatermark.sty) tex(embrac.sty) tex(float.sty) tex(fontspec.sty) tex(geometry.sty) tex(graphicx.sty) tex(indentfirst.sty) tex(lua-widow-control.sty) tex(mathpazo.sty) tex(nowidow.sty) tex(projlib-font.sty) tex(regexpatch.sty) tex(silence.sty) tex(tikz-cd.sty) tex(unicode-math.sty) tex(wrapfig.sty) texlive texlive-colorist texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
