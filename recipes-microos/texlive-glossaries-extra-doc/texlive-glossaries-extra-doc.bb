SUMMARY = "Documentation for texlive-glossaries-extra"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-extra"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.50svn64973"

RPM_NAME = "texlive-glossaries-extra-doc-2023.201.1.50svn64973-53.1.noarch.rpm"
RPM_HASH = "bb932a1cedefc673a04d7ae8fcafbac418dc15123bdc3b63a60ca67be888419c113c5a4cae9761a7afbf02f237945ff5cb133817d826bb3c348bee9f907a3e31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-extra-doc"
RDEPENDS:${PN} += ""

inherit rpm
