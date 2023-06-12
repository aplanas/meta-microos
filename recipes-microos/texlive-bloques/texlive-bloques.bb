SUMMARY = "Generate control diagrams"
DESCRIPTION = "The package uses TikZ to provide commands for generating \
control diagrams (specially in power electronics)."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn22490"

RPM_NAME = "texlive-bloques-2023.201.1.0svn22490-52.1.noarch.rpm"
RPM_HASH = "fe4efa47082ee9c90a8621d16bb9646a99c98366c9f81bf8c67cd207da09a524f10b90fab03e7d063851002937d31be7e2c37c71514184b6f6262ce13e8d1e00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(bloques.sty) \
texlive-bloques"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(tikz.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
