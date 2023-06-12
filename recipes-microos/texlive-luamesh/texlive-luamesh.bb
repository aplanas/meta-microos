SUMMARY = "Computes and draws 2D Delaunay triangulation"
DESCRIPTION = "The package allows to compute and draw 2D Delaunay \
triangulation. The algorithm is written with lua, and depending \
upon the choice of the engine, the drawing is done by MetaPost \
(with luamplib) or by TikZ. The Delaunay triangulation \
algorithm is the Bowyer and Watson algorithm. Several macros \
are provided to draw the global mesh, the set of points, or a \
particular step of the algorithm."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.7svn63875"

RPM_NAME = "texlive-luamesh-2023.201.0.0.7svn63875-52.1.noarch.rpm"
RPM_HASH = "314944bd4354fc78392d636c68d9f40b28166dac024f4fa24c9ea1edd602032abbc53b364a741c183e5d666aef60869a9bbfe6efd49d6f0578dcec2730c670e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(luamesh.sty) \
texlive-luamesh"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/luatex \
coreutils \
ed \
findutils \
grep \
sed \
tex(ifthen.sty) \
tex(luamplib.sty) \
tex(tikz.sty) \
tex(xcolor.sty) \
tex(xkeyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
