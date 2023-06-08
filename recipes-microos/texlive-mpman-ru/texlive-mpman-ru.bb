SUMMARY = "A Russian translation of the MetaPost manual"
DESCRIPTION = "A translation of the user manual, as distributed with MetaPost \
itself."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.004svn15878"

RPM_NAME = "texlive-mpman-ru-2023.201.1.004svn15878-54.1.noarch.rpm"
RPM_HASH = "89028603841b8a893c4863ec7d8336f36237ffc663114a1cf4800179c0768dedcaf80736bd99c815fe391bf94043e9fdeb3f23252ba8eb2f6385c3634d2f7f48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mpman-ru"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
