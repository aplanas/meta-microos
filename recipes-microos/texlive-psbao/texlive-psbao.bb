SUMMARY = "Draw Bao diagrams"
DESCRIPTION = "The package draws Bao diagrams in LaTeX. The package is a \
development of psgo, and uses PSTricks to draw the diagrams."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn55013"

RPM_NAME = "texlive-psbao-2023.201.1.0svn55013-52.1.noarch.rpm"
RPM_HASH = "8ea8f0170b1cae757cc7fd212af60bd7903b442a2e322853b3deaa005cecd70d97476e718b647163cb478cca8745584e479c3ace805e9d9267eeaf8aa1507bf9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(psbao.sty) \
texlive-psbao"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(calc.sty) \
tex(cool.sty) \
tex(etex.sty) \
tex(ifthen.sty) \
tex(pstricks.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
