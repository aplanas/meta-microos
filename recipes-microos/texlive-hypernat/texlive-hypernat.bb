SUMMARY = "Allow hyperref and natbib to work together"
DESCRIPTION = "Allows hyperref package and the natbib package with options \
'numbers' and 'sort&compress' to work together. This means that \
multiple sequential citations (e.g [3,2,1]) will be compressed \
to [1-3], where the '1' and the '3' are (color-)linked to the \
bibliography."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.0bsvn17358"

RPM_NAME = "texlive-hypernat-2023.201.1.0bsvn17358-52.1.noarch.rpm"
RPM_HASH = "49c541a80795e621915561c700b08c52dad9e21502d2213ce6083b59cbbf2880cfa4ba129f037a505246e965e996159d0681166f3721539d46695ac42de1196e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(hypernat.sty) texlive-hypernat"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
