SUMMARY = "Typeset SAS or R code or output"
DESCRIPTION = "The SASnRdisplay package serves as a front-end to listings, \
which permits statisticians and others to import source code \
and the results of their calculations or simulations into LaTeX \
projects. The package is also capable of overloading the Sweave \
User Manual and SASweave packages."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.95svn63255"

RPM_NAME = "texlive-sasnrdisplay-2023.201.0.0.95svn63255-53.1.noarch.rpm"
RPM_HASH = "574b7d1fd6a9c8ed0b6289fc26d4f814dd8131c4d4bb4b838709da9f119f24eaa4797a38b7501b5527429055eba32d31fc2d62fb411ce209501567bfb5010c45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(SASnRdisplay.cfg) tex(SASnRdisplay.sty) texlive-sasnrdisplay"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(caption.sty) tex(etoolbox.sty) tex(listings.sty) tex(needspace.sty) tex(xcolor.sty) tex(xkeyval.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
