SUMMARY = "Documentation for texlive-glossaries-danish"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-danish"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn35665"

RPM_NAME = "texlive-glossaries-danish-doc-2023.201.1.0svn35665-53.1.noarch.rpm"
RPM_HASH = "90e7af286aaf1369fe179b641b1f3896d196c8cce4e197a0d3a83f5d40b0678af696dec67cb00bab33768ab0dafea0619908817a6aed7e1df8c80f9030afcaec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-danish-doc"
RDEPENDS:${PN} += ""

inherit rpm
