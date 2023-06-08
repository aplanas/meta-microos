SUMMARY = "Documentation for texlive-swfigure"
DESCRIPTION = "This package includes the documentation for texlive-swfigure"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.9.20svn63255"

RPM_NAME = "texlive-swfigure-doc-2023.201.0.0.9.20svn63255-57.1.noarch.rpm"
RPM_HASH = "283ed191196b4f3064cf9c29aa9ce929ac3c343ae733b22c6ac3189cb3296d9827988eadd67cd719033744b427d0bf5d2a640cab814a70347f15e3ed7930a4d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-swfigure-doc"
RDEPENDS:${PN} += ""

inherit rpm
