SUMMARY = "GANTT module for ConTeXt"
DESCRIPTION = "Gantt is a module for drawing Gantt charts via MetaPost or \
PGF/TikZ."
LICENSE = "SUSE-Public-Domain"

PV = "2023.204.svn47085"

RPM_NAME = "texlive-context-gantt-2023.204.svn47085-54.1.noarch.rpm"
RPM_HASH = "6f8e2654e516d3b2a9e39d8029c86e399ac655a636e18b015aec74d481c5b2a8c07b87c70d0c0ba6ef4eaf5e8db614badd6ab383b17aa0787bbfd7058b137fe6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(gantt-s-mp.tex) \
tex(gantt-s-tikz.tex) \
tex(t-gantt.tex) \
texlive-context-gantt"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-context \
texlive-filesystem \
texlive-hatching \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
