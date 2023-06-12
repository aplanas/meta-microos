SUMMARY = "Typeset Bridge Diagrams"
DESCRIPTION = "This is a comprehensive package to draw all sorts of bridge \
diagrams, including hands (stand alone or arround a compass), \
bidding tables (stand alone or in connection with \
hands/compass), trick tables, and expert quizzes. Features: \
Works for all fontsizes from \\ssmall to \\HUGE. Different fonts \
for hands, bidding diagrams, compass, etc. are possible. \
Annotations to card and bidding diagrams. Automated check on \
consistency of suit and hands. Multilingual output of bridge \
terms. Extensive documentation: User manual, Reference manual, \
and Examples."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.6svn59010"

RPM_NAME = "texlive-onedown-2023.201.1.6svn59010-54.1.noarch.rpm"
RPM_HASH = "e97b804a652d7ebdfebd4fd6c71c5796954512081ae3c257d1163bf5e4b22672357bf9e0fd35c98dd8cccaad6f0e1e1b7ec773004805ea94e7987a5e107d4f04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(onedown.sty) \
texlive-onedown"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(expl3.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
