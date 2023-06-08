SUMMARY = "Simple consecutive numbering of chemical compounds"
DESCRIPTION = "The chemcompounds package allows for a simple consecutive \
numbering of chemical compounds. Optionally, it is possible to \
supply a custom name for each compound. The package differs \
from the chemcono package by not generating an odd-looking list \
of compounds inside the text."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-chemcompounds-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "2708cf6abb8a236c7ef5b247e81d22a300f14c422184914e35fe0554af2ddd0ae3fe9270f10c6f4e4c7e29ca55324b280bfb7530aac343a745a8be09d85b51ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(chemcompounds.sty) texlive-chemcompounds"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
