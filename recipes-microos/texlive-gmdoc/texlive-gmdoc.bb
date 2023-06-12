SUMMARY = "Documentation of LaTeX packages"
DESCRIPTION = "A LaTeX package and an example class for documenting (La)TeX \
packages, document classes, .dtx etc., providing hyperlinks. \
The package is believed to be compatible with doc and permits \
minimal markup of code (the macrocode environment is no longer \
necessary). The package provides automatic detection of \
definitions (detecting such things as \\def, \\newcommand, \
\\DeclareOption etc.). The package needs hyperref and the \
author's three 'basic' packages: gmutils, gmverb and gmiflink. \
As a bonus (and as an example of doc compatibility) driver \
files are provided that may be used to typeset the LaTeX Base."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.993svn21292"

RPM_NAME = "texlive-gmdoc-2023.201.0.0.993svn21292-53.1.noarch.rpm"
RPM_HASH = "3a0d11d416af997502da4954563e16bd6fe284af03b5ef29c36a0a3158e54f9e4961f8447c330f14ff04512421f4970dd91f83abf478d12e511f4ee8201c99e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(gmdoc.sty) \
tex(gmdocc.cls) \
tex(gmoldcomm.sty) \
texlive-gmdoc"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amsfonts.sty) \
tex(amsmath.sty) \
tex(amssymb.sty) \
tex(article.cls) \
tex(fontenc.sty) \
tex(geometry.sty) \
tex(gmiflink.sty) \
tex(gmutils.sty) \
tex(gmverb.sty) \
tex(lmodern.sty) \
tex(makeidx.sty) \
tex(multicol.sty) \
tex(tikz.sty) \
tex(trace.sty) \
tex(xcolor.sty) \
tex(xkeyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
