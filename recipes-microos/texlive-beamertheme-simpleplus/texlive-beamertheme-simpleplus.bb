SUMMARY = "A simple and clean theme for LaTeX beamer"
DESCRIPTION = "This package provides a simple and clean theme for LaTeX \
Beamer. It can be used for academic and scientific \
presentations."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.0svn64770"

RPM_NAME = "texlive-beamertheme-simpleplus-2023.201.1.0svn64770-53.1.noarch.rpm"
RPM_HASH = "ab309df921f793ed98cd26289ed857bb0de3c00641bdaa72a83f2a410c7e16394fd94bf39498063264dc8bdb8f3c0bdb9c995a3c5e08e1e740b1c287f27c2da6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(beamercolorthemeSimplePlus.sty) \
tex(beamerfontthemeSimplePlus.sty) \
tex(beamerinnerthemeSimplePlus.sty) \
tex(beamerthemeSimplePlus.sty) \
texlive-beamertheme-simpleplus"
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
