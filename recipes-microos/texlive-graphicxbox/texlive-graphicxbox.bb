SUMMARY = "Insert a graphical image as a background"
DESCRIPTION = "The package defines two new commands \\graphicxbox and \
\\fgraphicxbox, which are companions to \\colorbox and \\fcolorbox \
of the Standard LaTeX color package. The \\graphicxbox command \
inserts a graphical image as a background rather than a \
background color, while \\fgraphicxbox does the same thing, but \
also draws a colored frame around the box."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn32630"

RPM_NAME = "texlive-graphicxbox-2023.201.1.0svn32630-53.1.noarch.rpm"
RPM_HASH = "cddb96a2849bbdd9293bd85b227299a999bf19a8d105d7c4141d897a4ec35b700724d64b9a7e878b42db538dbdc3c296ca1b1ef439a1cd397edd8315bb3c61d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(graphicxbox.sty) \
texlive-graphicxbox"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
