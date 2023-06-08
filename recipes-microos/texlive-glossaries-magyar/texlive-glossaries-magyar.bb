SUMMARY = "Magyar language module for glossaries package"
DESCRIPTION = "Magyar language module for glossariesr package."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn35665"

RPM_NAME = "texlive-glossaries-magyar-2023.201.1.0svn35665-53.1.noarch.rpm"
RPM_HASH = "fd9da4d7ed2a015114fda92dc0d95c7f17ee9e1e0b886dbb3cee6acb73f6c461198e694b36ea1a443deb39846288f220cfee0022beaa6c2e0063aa84bb289c50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(glossaries-magyar-noenc.ldf) tex(glossaries-magyar-utf8.ldf) tex(glossaries-magyar.ldf) texlive-glossaries-magyar"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
