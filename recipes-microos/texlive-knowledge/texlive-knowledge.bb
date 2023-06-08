SUMMARY = "Displaying, hyperlinking, and indexing notions in a document"
DESCRIPTION = "The package offers a systematic way to handle \
notions/concepts/terms throughout a document. It helps building \
an index. In combination with hyperref it makes it easy to have \
every reference of a concept linked to its introduction. It \
also offers simple notations."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.28svn61991"

RPM_NAME = "texlive-knowledge-2023.201.1.28svn61991-55.1.noarch.rpm"
RPM_HASH = "d59f6d6bcd1fd1bd96fb239486ff99cfd9a2c8c772fdece8d1e00a496425cc94fdc3a8327dd3c703dcd5a0c846bb758dda4a37816db701c5082c2ba374b2188a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(knowledge.sty) texlive-knowledge"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(currfile.sty) tex(etoolbox.sty) tex(expl3.sty) tex(l3keys2e.sty) tex(xparse.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
