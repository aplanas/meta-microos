SUMMARY = "A typographic ruler for TeX"
DESCRIPTION = "The file processes to produce (real) rulers; the author \
suggests printing them on transparent plastic and trimming for \
use as a 'real' ruler. The rule widths are 0.05mm, which can be \
challenging for (old) laser printers."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.1svn54251"

RPM_NAME = "texlive-ruler-2023.201.1.1svn54251-53.1.noarch.rpm"
RPM_HASH = "bfa213cc099c2bdb5a698d8edc08948d6ade4cab5f0a4166436055309f558ea78d08da0632bb3a019f7454ada1d43dfc84e804c060fd6b7339258d643fdf5c02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ruler.tex) \
texlive-ruler"
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
