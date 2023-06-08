SUMMARY = "German language module for glossaries package"
DESCRIPTION = "German language module for the glossaries package."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn35665"

RPM_NAME = "texlive-glossaries-german-2023.201.1.0svn35665-53.1.noarch.rpm"
RPM_HASH = "193efdc6c1211c3376e62ea17a0bf23b7424fe84278c537028c9f2b2f504b5eeb635fefb2b680ecb23c01269f9b404164f338297c24050bcd6336c022ab1b085"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(glossaries-german.ldf) texlive-glossaries-german"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
