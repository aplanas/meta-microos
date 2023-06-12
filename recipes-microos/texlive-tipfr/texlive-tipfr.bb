SUMMARY = "Produces calculator's keys with the help of TikZ"
DESCRIPTION = "The package provides commands to draw calculator keys with the \
help of TikZ. It also provides commands to draw the content of \
screens and of menu items."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn38646"

RPM_NAME = "texlive-tipfr-2023.201.1.5svn38646-52.1.noarch.rpm"
RPM_HASH = "05ffe2d32e5b1a9158d202a6fee93923c754a6f2afab3fde7425bebe9cb64fd81b2d99da2852e7c5d8d8b84dc6e1200101de18a28a61048726b7934e631f8517"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(tipfr.sty) \
texlive-tipfr"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amssymb.sty) \
tex(ifthen.sty) \
tex(mathtools.sty) \
tex(multido.sty) \
tex(newtxtt.sty) \
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
