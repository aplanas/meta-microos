SUMMARY = "Extended TeX logo macros"
DESCRIPTION = "This package exposes spacing parameters for various TeX logos \
to the end user, to optimise the logos for different fonts. \
Written especially for XeLaTeX users."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.12svn18611"

RPM_NAME = "texlive-metalogo-2023.201.0.0.12svn18611-54.1.noarch.rpm"
RPM_HASH = "49d9cfff87f97f8c7f3ba9acdede68f79da0d586150d22a8358500591e5c933d8046a9eb40a850cbbe1f0c3c547bd01d10a9340f3e7aad689f5e6752b1d0d7fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(metalogo.sty) \
texlive-metalogo"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(fontspec.sty) \
tex(graphicx.sty) \
tex(ifxetex.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
