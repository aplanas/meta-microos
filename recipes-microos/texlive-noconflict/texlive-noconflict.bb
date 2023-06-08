SUMMARY = "Resolve macro name conflict between packages"
DESCRIPTION = "The package provides several commands to prefix (and hence \
obscure) a macro's (or a sequence of macros') name, and to \
restore the original macro(s) at places in a document where \
they are needed."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn30140"

RPM_NAME = "texlive-noconflict-2023.201.1.0svn30140-54.1.noarch.rpm"
RPM_HASH = "130fc88c80e78bbbf9e5b3bc00af0a2c077329db4f83c1c7aaff025aae51ba718a0d4a2cc40c3b70a592aa813fe09baf5afd798abbc6052604ebb087638f1bfe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(noconflict.sty) texlive-noconflict"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
