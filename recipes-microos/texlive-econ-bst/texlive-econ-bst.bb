SUMMARY = "BibTeX style for economics papers"
DESCRIPTION = "This is a BibTeX style file for papers in economics. It \
provides the following features: author-year type citation \
reference style used in economics papers highly customizable \
use of 'certified random order' as proposed by Ray Robson \
(2018)"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.1.1svn61499"

RPM_NAME = "texlive-econ-bst-2023.201.3.1.1svn61499-53.1.noarch.rpm"
RPM_HASH = "23283e997196f59033667603466926dbc1d17b3697cda806f92c5c6a2fe665d8f256b530332a22eb202cbd891b55fe6a7bb878c8ac62c589cbe50c151a2b9ec3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-econ-bst"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
