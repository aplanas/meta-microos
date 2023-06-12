SUMMARY = "Extend list of predefined colour names for MetaPost"
DESCRIPTION = "The MetaPost format plain.mp provides only five built-in colour \
names (variables), all of which are defined in the RGB model: \
red, green and blue for the primary colours and black and \
white. The package makes more than 500 colour names from \
different colour sets in different colour models available to \
MetaPost. Colour sets include X11, SVG, DVIPS and xcolor \
specifications."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.20svn23252"

RPM_NAME = "texlive-mpcolornames-2023.201.0.0.20svn23252-54.1.noarch.rpm"
RPM_HASH = "14b3a5effc5b197b8b10a68692a108c7cbe42d3f8a235d62efe7a1946a44a2d120eb9dd7f373ffac94a9e65b56827f2e793ad88262329c1b30973cfbe9cf1058"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mpcolornames"
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
