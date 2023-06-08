SUMMARY = "Draw liftarms"
DESCRIPTION = "This package can be used to draw liftarms with TikZ. It \
provides several options for the appearance of the liftarms, a \
command which connects two liftarms and an environment to \
describe a construction."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn62981"

RPM_NAME = "texlive-liftarm-2023.201.2.0svn62981-54.1.noarch.rpm"
RPM_HASH = "1a73a3329367535b243ef2157fa8a5a95d4996d198abe20060cb582d50911b511d84e32e90a7758ce6a563ad3d38aa10d7f327443e4a6996492c4c5fb04623a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(liftarm.sty) texlive-liftarm"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(etoolbox.sty) tex(tikz.sty) tex(xcolor.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
