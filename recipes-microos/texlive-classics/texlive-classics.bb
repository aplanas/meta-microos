SUMMARY = "Cite classic works"
DESCRIPTION = "The package provides a basic framework to cite classic works \
(specially from authors such as Homer, Plato, Aristotle, \
Descartes, Hume, and Kant) in accordance with traditional \
pagination systems. It may be used in conjunction with other \
citation packages."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1asvn53671"

RPM_NAME = "texlive-classics-2023.201.0.0.1asvn53671-53.1.noarch.rpm"
RPM_HASH = "24c4d1f2a05999370178629db32f3fb5881d8c531fbe265b3f8e1c80a3a1b400bde7d9056b19c524d98bc4d2c201844077feb4c620b0d01b878c696cc2314b3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(classics.sty) texlive-classics"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(expl3.sty) tex(xparse.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
