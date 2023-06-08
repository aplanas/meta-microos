SUMMARY = "Documentation for texlive-glossaries-spanish"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-spanish"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn35665"

RPM_NAME = "texlive-glossaries-spanish-doc-2023.201.1.0svn35665-53.1.noarch.rpm"
RPM_HASH = "0ecb7d3c18903f9a4ea37b93bc05d2689c3e8a04df6825978e2d98435768c9bca20b7e820b3eb9cfe939fac762be828f6a48e322026bd7b4f333e6684c20d4c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-spanish-doc"
RDEPENDS:${PN} += ""

inherit rpm
