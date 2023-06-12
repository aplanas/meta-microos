SUMMARY = "Draw Nassi-Shneiderman charts"
DESCRIPTION = "Even in the age of OOP one must develop algorithms. \
Nassi-Shneiderman charts are a well known tool to describe an \
algorithm in a graphical way. The package offers some macros \
for generating those charts in a LaTeX document. The package \
provides the most important elements of a Nassi-Shneiderman \
charts, including processing blocks, loops, mapping conventions \
for alternatives, etc. The charts are drawn using the picture \
environment (using pict2e for preference)."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.3c_0_g7d3fc5bsvn47931"

RPM_NAME = "texlive-struktex-2023.201.2.3c_0_g7d3fc5bsvn47931-57.1.noarch.rpm"
RPM_HASH = "af93d9f3c0cee0d2feccf1d234b83eb5c4246b518144fe40f9fb9c16841d74bccb04364864d864376309e45c1d25b196c16745d84ce5f7a60486687a3fdad965"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(strukdoc.sty) \
tex(struktex.sty) \
tex(struktxf.sty) \
tex(struktxp.sty) \
texlive-struktex"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(color.sty) \
tex(curves.sty) \
tex(hyperref.sty) \
tex(ifpdf.sty) \
tex(ifthen.sty) \
tex(nameref.sty) \
tex(pict2e.sty) \
tex(url.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
