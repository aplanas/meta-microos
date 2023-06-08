SUMMARY = "Slovene language module for glossaries package"
DESCRIPTION = "Slovene language module for glossaries package."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn51211"

RPM_NAME = "texlive-glossaries-slovene-2023.201.1.0svn51211-53.1.noarch.rpm"
RPM_HASH = "3de2dd0e7d6505317a4b7b276efeac5e7dfc588bcf9319608b4a93950f6ddc1f25bda62e99e5c5047b2ae262446f2de20d3190a7c5596e0c40a7a324562d9e75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(glossaries-slovene.ldf) texlive-glossaries-slovene"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
