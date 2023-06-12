SUMMARY = "Short introduction to LaTeX, French translation"
DESCRIPTION = "French version of A Short Introduction to LaTeX2e."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.5.01fr_0svn23332"

RPM_NAME = "texlive-lshort-french-2023.201.5.01fr_0svn23332-54.1.noarch.rpm"
RPM_HASH = "119c2d19665c309a2872273e71f8b159bfaa7147f5e030bed9d20769f0ee1b99601c826fee8c08a90174db100a55939f3c42cda08a69e500c64e954a6dff1c35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lshort-french"
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
