SUMMARY = "Documentation for texlive-simpleoptics"
DESCRIPTION = "This package includes the documentation for texlive-simpleoptics"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1.1svn62977"

RPM_NAME = "texlive-simpleoptics-doc-2023.201.1.1.1svn62977-53.1.noarch.rpm"
RPM_HASH = "f58a295ffb1c4f60093e503df586c77af0fb4a07442ab2fd68d3fbbc2f1ea0e9bf68f022417965fd36fca3f2b66bc63d05466aa2144b12f672455c763867f732"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-simpleoptics-doc"
RDEPENDS:${PN} += ""

inherit rpm
