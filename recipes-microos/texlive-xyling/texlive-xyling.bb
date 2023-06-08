SUMMARY = "Draw syntactic trees, etc., for linguistics literature, using xy-pic"
DESCRIPTION = "The macros in this package model the construction of linguistic \
tree structures as a genuinely graphical problem: they contain \
two types of objects, BRANCHES and NODE LABELS, and these are \
positioned relative to a GRID. It is essential that each of \
these three elements is constructed independent of the other \
two, and hence they can be modified without unwanted side \
effects. The macros are based on the xy-pic package."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn15878"

RPM_NAME = "texlive-xyling-2023.201.1.1svn15878-52.1.noarch.rpm"
RPM_HASH = "310b9f2b16a1a574cd4c69d962f4bea1823b47b8a2c56f7b62131ee3c6f22d89f3d20556f86dda270085780e7dad4e52bf21bd556fec2a50bed198b0b6b60039"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(xyling.sty) texlive-xyling"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(color.sty) tex(ifthen.sty) tex(xy.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
