SUMMARY = "Identify draft copies"
DESCRIPTION = "Places the word DRAFT (or other words) in light grey diagonally \
across the background (or at the bottom) of each (or selected) \
pages of the document. The package uses PostScript \\special \
commands, and may not therefore be used with pdfLaTeX. For that \
usage, consider the wallpaper or draftwatermark packages."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.16svn15878"

RPM_NAME = "texlive-draftcopy-2023.201.2.16svn15878-52.1.noarch.rpm"
RPM_HASH = "7dd226e884881e9aff1b5b1314ec410653ec6ee51073e29c5630d06d36d66e3088e9a442d40667f6b8b8a330aff0edd24c2d3d2a8e1a0d09c33d530bc847f01c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(draftcopy.cfg) \
tex(draftcopy.sty) \
texlive-draftcopy"
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
