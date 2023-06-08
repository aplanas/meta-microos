SUMMARY = "BibLaTeX style for historians"
DESCRIPTION = "The package provides a BibLaTeX style, (mostly) meeting the \
requirements of the History Faculty of the University of \
Freiburg (Germany)."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn42121"

RPM_NAME = "texlive-geschichtsfrkl-2023.201.1.4svn42121-52.1.noarch.rpm"
RPM_HASH = "5c91bd5106577206c6e93a47cccc8d00ebb4e3984362a9c786861803ff94c317a78e2aa39bfce36503cf919bd3c29c6dbbdaf33a3b5f217b1d81c0b20a6bd0c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(geschichtsfrkl.bbx) tex(geschichtsfrkl.cbx) tex(geschichtsfrkldoc.sty) texlive-geschichtsfrkl"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(standard.bbx) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
