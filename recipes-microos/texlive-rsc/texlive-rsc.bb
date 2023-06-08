SUMMARY = "BibTeX style for use with RSC journals"
DESCRIPTION = "The rsc package provides a BibTeX style in accordance with the \
requirements of the Royal Society of Chemistry. It was \
originally based on the file pccp.bst, but also implements a \
number of styles from the achemso package. The package is now a \
stub for the chemstyle package, which the author developed to \
unify the writing of articles with a chemistry content."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.1fsvn41923"

RPM_NAME = "texlive-rsc-2023.201.3.1fsvn41923-53.1.noarch.rpm"
RPM_HASH = "2e5a30901cdbf7005397b770ae6b11b176a741022e94c9a966bcc2a660e3000e341922887f685fc623c07d64a7f9c0b1e45eaa0f0114da5a0407625a19d903ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(rsc.sty) texlive-rsc"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(kvoptions.sty) tex(mciteplus.sty) tex(natbib.sty) tex(natmove.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
