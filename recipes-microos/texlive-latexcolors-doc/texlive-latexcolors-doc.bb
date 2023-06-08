SUMMARY = "Documentation for texlive-latexcolors"
DESCRIPTION = "This package includes the documentation for texlive-latexcolors"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1asvn49888"

RPM_NAME = "texlive-latexcolors-doc-2023.201.0.0.1asvn49888-54.1.noarch.rpm"
RPM_HASH = "4e9f71073a63764c2eebb23b0c5fcf48163ab0eff2dd5204f1561a0cb3c086cf944c13a7299023ac1b26cb6db2eaa12908a91e3b9f6e68151652c135a5721bc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latexcolors-doc"
RDEPENDS:${PN} += ""

inherit rpm
