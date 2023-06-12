SUMMARY = "A pair of fonts for different Georgian alphabets"
DESCRIPTION = "Two Georgian fonts, in both Metafont and Type 1 formats, which \
cover the Mxedruli and the Xucuri alphabets."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.3csvn30021"

RPM_NAME = "texlive-mxedruli-2023.201.3.3csvn30021-54.1.noarch.rpm"
RPM_HASH = "7bd6510ebc59fb429ed1daf646ac4584c7b2d9ed9b8a9540cfc3dc1c386d49da79c5ad9c512585bbb7f393b2d70de48a0224b723fa28400605ad98c1c8d3c9e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(mxed10.tfm) \
tex(mxedbf10.tfm) \
tex(mxedc10.tfm) \
tex(mxedi10.tfm) \
tex(mxedruli.map) \
tex(mxedruli.sty) \
tex(umxed.fd) \
tex(uxuc.fd) \
tex(xuc10.tfm) \
tex(xucuri.sty) \
texlive-mxedruli"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(updmap.cfg) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-mxedruli-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
