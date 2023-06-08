SUMMARY = "Help for writing programming language semantics"
DESCRIPTION = "Eases the typesetting of notation of semantics and compilers. \
Includes T-diagrams, various derivation symbols and inference \
trees."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn15878"

RPM_NAME = "texlive-semantic-2023.201.2.0svn15878-53.1.noarch.rpm"
RPM_HASH = "8b9610b1659ca992cc16d645221e8412dc632777587445bc720b652556b63ec7dedd3084aca6b510089672c0936f60ffc018ffc8f3918edc12ee0c303b0b47e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(infernce.sty) tex(ligature.sty) tex(reserved.sty) tex(semantic.sty) tex(shrthand.sty) tex(tdiagram.sty) texlive-semantic"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(mathbbol.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
