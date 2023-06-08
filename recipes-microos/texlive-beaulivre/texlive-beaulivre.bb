SUMMARY = "Write your books in a colorful way"
DESCRIPTION = "This package provides a LaTeX class for typesetting books with \
a colorful design. Currently, it has native support for Chinese \
(both simplified and traditional), English, French, German, \
Italian, Japanese, Portuguese (European and Brazilian), Russian \
and Spanish typesetting. It compiles with either XeLaTeX or \
LuaLaTeX. This is part of the colorist class series and depends \
on colorist.sty from the colorist package. The package name \
'beaulivre' is taken from the French words 'beau' (= \
'beautiful') and 'livre' (= 'book')."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn65475"

RPM_NAME = "texlive-beaulivre-2023.201.svn65475-53.1.noarch.rpm"
RPM_HASH = "9f3282666cbf8a2a0696b64c66c7885c7062c09f997554bd92e95b0679b05b6b60402012a18c53cfed9c79347f0881cd68cf9bfc64f0e5052154af18d4617bd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(beaulivre.cls) texlive-beaulivre"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(amssymb.sty) tex(caption.sty) tex(colorist.sty) tex(ctex.sty) tex(draftwatermark.sty) tex(embrac.sty) tex(float.sty) tex(fontspec.sty) tex(geometry.sty) tex(graphicx.sty) tex(indentfirst.sty) tex(lua-widow-control.sty) tex(mathpazo.sty) tex(nowidow.sty) tex(projlib-font.sty) tex(regexpatch.sty) tex(silence.sty) tex(tikz-cd.sty) tex(unicode-math.sty) tex(wrapfig.sty) texlive texlive-colorist texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
