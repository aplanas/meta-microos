SUMMARY = "Dutch language module for glossaries package"
DESCRIPTION = "Dutch language module for glossariesr package."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn35685"

RPM_NAME = "texlive-glossaries-dutch-2023.201.1.1svn35685-53.1.noarch.rpm"
RPM_HASH = "dc928280a1993baab771cde7de36bae5fddff90c1722fc5fbd2ebae330b8b2eae0a473a81d7d83250d34dc2bd6fbe72f565da11e6275248364cc1230f730bbf8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(glossaries-dutch.ldf) texlive-glossaries-dutch"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
