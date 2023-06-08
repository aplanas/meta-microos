SUMMARY = "Decorative rules between columns"
DESCRIPTION = "This package lets you customize the appearance of the vertical \
rule that appears between columns of multicolumn text. It is \
primarily intended to work with the multicol package, hence its \
name, but also supports the twocolumn option and \\twocolumn \
macro provided by the standard classes (and related classes \
such as the KOMA-Script equivalents). The package depends on \
expl3 and xparse."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3asvn56366"

RPM_NAME = "texlive-multicolrule-2023.201.1.3asvn56366-54.1.noarch.rpm"
RPM_HASH = "bd3d5694ff1a2e8f59d2dbc73505835da207a0a3ad20529e3832e486c8956b3d8e33e5a8bb86b3c50fab8d1271b744db19f72ab3cac8c608758f223f4b6bafa2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(multicolrule.sty) texlive-multicolrule"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(expl3.sty) tex(l3keys2e.sty) tex(multicol.sty) tex(scrlfile.sty) tex(tikz.sty) tex(xcolor.sty) tex(xparse.sty) tex(xpatch.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
