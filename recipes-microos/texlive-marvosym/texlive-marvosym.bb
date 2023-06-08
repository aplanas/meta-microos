SUMMARY = "Martin Vogel's Symbols (marvosym) font"
DESCRIPTION = "Martin Vogel's Symbol font (marvosym) contains the Euro \
currency symbol as defined by the European commission, along \
with symbols for structural engineering; symbols for steel \
cross-sections; astronomy signs (sun, moon, planets); the 12 \
signs of the zodiac; scissor symbols; CE sign and others. The \
package contains both the original TrueType font and the \
derived Type 1 font, together with support files for TeX \
(LaTeX)."
LICENSE = "OFL-1.1"

PV = "2023.201.2.2asvn29349"

RPM_NAME = "texlive-marvosym-2023.201.2.2asvn29349-52.1.noarch.rpm"
RPM_HASH = "675a9afc5ecd678a24ee0b047381b6c9b3c8515c85dda41904f478c63b67f78397cc59699c4861fe18784f1b4781e33f636416d508ba6de8cf3de8ed09298aca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(marvosym.map) tex(marvosym.sty) tex(umvs.fd) tex(umvs.tfm) texlive-marvosym"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(updmap.cfg) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-marvosym-fonts texlive-scripts texlive-scripts-bin"

inherit rpm
