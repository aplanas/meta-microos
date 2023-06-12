SUMMARY = "Defines the 256 colors from Google Material Color Palette"
DESCRIPTION = "The package is built on top of the great xcolor package. It \
provides a useful definition of the beautiful Google Material \
Color Palette, available at Google Material design, for its use \
in document writing with LaTeX and Friends."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn42289"

RPM_NAME = "texlive-xcolor-material-2023.201.0.0.1svn42289-52.1.noarch.rpm"
RPM_HASH = "23e5293ed6ca421a12dba1f3bee4016e2bfa6b624584016df26d572b89e78c6ca333a8711c2f40e00e4f16bcfbc46f2d92e03813c75dda39c7ce0103e580d194"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(xcolor-material.sty) \
texlive-xcolor-material"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(kvoptions.sty) \
tex(xcolor.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
