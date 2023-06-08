SUMMARY = "Little style to create a standard titlepage for diploma thesis"
DESCRIPTION = "Yet another thesis titlepage style: support of Fachhochschule \
Aachen (Standort Juelich)"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn15878"

RPM_NAME = "texlive-thesis-titlepage-fhac-2023.201.0.0.1svn15878-54.1.noarch.rpm"
RPM_HASH = "0adcfedc22954c3177c78021320b9337155de603ecac0e338904c29c771499a077f038c168e527348fa3918678d671344c5cdf3c244a05b937102b7de3f83133"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(fhACtitlepage.cfg) tex(fhACtitlepage.sty) tex(figbib_add.sty) tex(gloss_add.sty) texlive-thesis-titlepage-fhac"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(color.sty) tex(figbib.sty) tex(gloss.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
