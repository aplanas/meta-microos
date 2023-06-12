SUMMARY = "LaTeX-style graphics for Plain TeX users"
DESCRIPTION = "The Plain TeX graphics package is mostly a thin shell around \
the LaTeX graphicx and color packages, with support of the \
LaTeX-isms in those packages provided by miniltx (which is the \
largest part of the bundle). The bundle also contains a file \
'picture.tex', which is a wrapper around the autopict.sty, and \
provides the LaTeX picture mode to Plain TeX users."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn65187"

RPM_NAME = "texlive-graphics-pln-2023.201.svn65187-53.1.noarch.rpm"
RPM_HASH = "4590ad931cae6c7a128895cdc7ac32bca819ccdc7b487bcaa5938db901c0fce3d31a8256b83a514fb3bcc07595a72262d3a5adacda8c9f2821f054573ff31226"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(autopict.sty) \
tex(color.tex) \
tex(graphicx.tex) \
tex(miniltx.tex) \
tex(picture.tex) \
tex(psfrag.tex) \
texlive-graphics-pln"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
