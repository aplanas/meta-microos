SUMMARY = "Documentation for texlive-biblatex-enc"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-enc"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn44627"

RPM_NAME = "texlive-biblatex-enc-doc-2023.201.1.0svn44627-53.1.noarch.rpm"
RPM_HASH = "4b944c4d65bcfdb4823aa387dbd361b6f5d8d58e0f60453e45bddda5cdd9d504041bb137e08936659bcf20ff97ebfdb739dc844227a4bba1fc319a645f55ea73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-enc-doc"
RDEPENDS:${PN} += ""

inherit rpm
