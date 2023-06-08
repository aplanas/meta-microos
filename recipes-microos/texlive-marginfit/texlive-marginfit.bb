SUMMARY = "Improved margin notes"
DESCRIPTION = "This package fixes various bugs with the margin paragraph \
implementation of LaTeX. Those bugs include margin notes that \
are attached to the wrong side as well as those that stick out \
of the bottom of the page. This package provides a drop-in \
replacement solution."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn48281"

RPM_NAME = "texlive-marginfit-2023.201.1.1svn48281-52.1.noarch.rpm"
RPM_HASH = "558b2d6a1a22bde3077f98dc62d214370fe82ae5b4fe10d104d182fcd102a26493f02b6addcd5db31cdaa87b6161c62d956d63ba32b52bcf0d3b7e861b804ecc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(marginfit.sty) texlive-marginfit"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
