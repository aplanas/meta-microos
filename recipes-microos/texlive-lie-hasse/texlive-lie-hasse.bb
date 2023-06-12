SUMMARY = "Draw Hasse diagrams"
DESCRIPTION = "This package draws Hasse diagrams of the partially ordered sets \
of the simple roots of any complex simple Lie algebra. It uses \
the Dynkin diagrams package dynkin-diagrams."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn61719"

RPM_NAME = "texlive-lie-hasse-2023.201.1.0svn61719-54.1.noarch.rpm"
RPM_HASH = "a32d8233c83b76ab83246b75ec1530731d3af32fecd0dd82d43573a879b9176b9ad0889019d1495a9f87365bfebf15621309f75e0f6fac9d0f769e7cd284d41c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(lie-hasse.sty) \
texlive-lie-hasse"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(dynkin-diagrams.sty) \
tex(xcolor.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
