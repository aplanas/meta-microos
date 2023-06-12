SUMMARY = "Draw arcs over and under text"
DESCRIPTION = "The package provides two commands for placing an arc over \
(\\overarc) or under (\\underarc) a piece of text. (The text may \
be up to three letters long.) The commands generate an \\hbox, \
and may be used both in text and in maths formulae."
LICENSE = "LPPL-1.0"

PV = "2023.201.1svn15878"

RPM_NAME = "texlive-arcs-2023.201.1svn15878-54.1.noarch.rpm"
RPM_HASH = "f61862169c0e44bbdd3304c6bd95d8574c3b579d21d02ac7aaecd0f32affedddc250815386182b02a2f52115a22f7c5d4d6bd470018b8b578fb8e169de07302c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(arcs.sty) \
texlive-arcs"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(relsize.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
