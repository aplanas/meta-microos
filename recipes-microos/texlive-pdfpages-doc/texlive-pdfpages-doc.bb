SUMMARY = "Documentation for texlive-pdfpages"
DESCRIPTION = "This package includes the documentation for texlive-pdfpages"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5xsvn65319"

RPM_NAME = "texlive-pdfpages-doc-2023.201.0.0.5xsvn65319-51.1.noarch.rpm"
RPM_HASH = "8325558065fa48fee8e513183add1b7d77e198940f225abdc7aa7364ab491772062699bd03e8b65cf946376f139eeb23c3c0d7ab8384b8cc14b63cdd23956b35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdfpages-doc"
RDEPENDS:${PN} += ""

inherit rpm
