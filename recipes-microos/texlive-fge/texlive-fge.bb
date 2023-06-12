SUMMARY = "A font for Frege's Grundgesetze der Arithmetik"
DESCRIPTION = "The fonts are provided as Metafont source and Adobe Type 1 \
(pfb) files. A small LaTeX package (fge) is included."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.25svn37628"

RPM_NAME = "texlive-fge-2023.201.1.25svn37628-52.1.noarch.rpm"
RPM_HASH = "683a6186bcb16d2b9ac8c25f33d7303dcb6c6da87429f6f84f2febcccd08bde2c1865618c68d2bc73f82450f5d91a23af9b66ac17c939364fb9fea7d689ec204"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(Ufgeit.fd) \
tex(Ufgerm.fd) \
tex(fge.cfg) \
tex(fge.map) \
tex(fge.sty) \
tex(fgeit10.tfm) \
tex(fgerm10.tfm) \
texlive-fge"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(updmap.cfg) \
texlive \
texlive-fge-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
