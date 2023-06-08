SUMMARY = "Pictures for creating children's activities"
DESCRIPTION = "This package was created with the aim of facilitating the work \
of Elementary School teachers who need to create colorful and \
attractive activities for their students. It is a product of \
the Computational Mathematics discipline offered at the Federal \
University of Vicosa -- Campus UFV -- Florestal by professor \
Fernando de Souza Bastos. It makes use of the TikZ and xcolor \
packages."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1.1svn62945"

RPM_NAME = "texlive-figchild-2023.201.2.1.1svn62945-52.1.noarch.rpm"
RPM_HASH = "6ace108ccdd62f30b43ff84c6907cee987deee36539aef822604dcd2fcd004b067f9ed6caa294ff05418b45ec73e81807c988c5870e1f413ad1cea85647fee79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(figchild.sty) texlive-figchild"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(tikz.sty) tex(xcolor.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
