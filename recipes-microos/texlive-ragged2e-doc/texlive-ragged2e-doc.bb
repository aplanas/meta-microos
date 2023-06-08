SUMMARY = "Documentation for texlive-ragged2e"
DESCRIPTION = "This package includes the documentation for texlive-ragged2e"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.4svn66152"

RPM_NAME = "texlive-ragged2e-doc-2023.201.3.4svn66152-53.1.noarch.rpm"
RPM_HASH = "e5a9f35ada56afc0577e8c29f0200dbf90c753cf0d9bdef8d8ffc7239c6cfb38995a953fa276c8519a55fd4af31a085f9b7a0dc94e0bc78529fdd7b32abdf125"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ragged2e-doc"
RDEPENDS:${PN} += ""

inherit rpm
