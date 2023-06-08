SUMMARY = "Documentation for texlive-chngcntr"
DESCRIPTION = "This package includes the documentation for texlive-chngcntr"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1asvn47577"

RPM_NAME = "texlive-chngcntr-doc-2023.201.1.1asvn47577-53.1.noarch.rpm"
RPM_HASH = "e3531981a396f4b7027f1c97e0aec4216606f6dfbfe01d5087aa827ed985ebb1ead4b8f53bd1c5d4e360eec17a0cd8b32753ead51d0713f16b258c6e63c465be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chngcntr-doc"
RDEPENDS:${PN} += ""

inherit rpm
