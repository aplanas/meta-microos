SUMMARY = "Draw process flow diagrams in chemical engineering"
DESCRIPTION = "This package provides TikZ shapes to represent commonly \
encountered unit operations for depiction in process flow \
diagrams (PFDs) and, to a lesser extent, process and \
instrumentation diagrams (PIDs). The package was designed with \
undergraduate chemical engineering students and faculty in \
mind, and the number of units provided should cover--in \
Turton's estimate--about 90 percent of all fluid processing \
operations."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0asvn60089"

RPM_NAME = "texlive-pfdicons-2023.201.1.0asvn60089-51.1.noarch.rpm"
RPM_HASH = "5206e847fb0e584b2fc5e784fb300870af8b0af2aeb9719f91977562fd8365be1a83b58e4417700bc812d9b67c719b72d14dd3df0736e931a579ebe86f9f633d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pfdicons.sty) \
texlive-pfdicons"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(ifthen.sty) \
tex(tikz.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
