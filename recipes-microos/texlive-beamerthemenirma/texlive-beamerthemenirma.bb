SUMMARY = "A Beamer theme for academic presentations"
DESCRIPTION = "The package developed for academic purposes. The distribution \
includes nothing more than style file needed for preparing \
presentations."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn20765"

RPM_NAME = "texlive-beamerthemenirma-2023.201.0.0.1svn20765-53.1.noarch.rpm"
RPM_HASH = "9830a592c08efcdc8fe78797fedc66091350f5ee58100bbf9ec48f56b19b3f9ad527e61d08bfe3ca1675fd86d0728e813d782bdc9f5909a6246bec896542e35c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(beamerthemenirma.sty) texlive-beamerthemenirma"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(beamerbasethemes.sty) tex(pgf.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
