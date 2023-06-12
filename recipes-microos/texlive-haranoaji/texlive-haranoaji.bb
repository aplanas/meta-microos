SUMMARY = "Harano Aji Fonts"
DESCRIPTION = "Harano Aji Fonts (Harano Aji Mincho and Harano Aji Gothic) are \
fonts obtained by replacing Adobe-Identity-0 (AI0) CIDs of \
Source Han fonts (Source Han Serif and Source Han Sans) with \
Adobe-Japan1 (AJ1) CIDs. There are 14 fonts, 7 weights each for \
Mincho and Gothic."
LICENSE = "OFL-1.1"

PV = "2023.201.20230223svn66115"

RPM_NAME = "texlive-haranoaji-2023.201.20230223svn66115-53.1.noarch.rpm"
RPM_HASH = "adf564146de19b47ac20f69687d14180cb90177df40a4441a02e13a65560b44187b8e67c90ac048056750d295e566ce0161a742e3f1d7eb6d12541e549720ad9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-haranoaji"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
perl \
perl(TeXLive::TLUtils) \
sed \
tex(texmf.cnf) \
texlive \
texlive-filesystem \
texlive-haranoaji-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-texlive.infra"

inherit rpm
