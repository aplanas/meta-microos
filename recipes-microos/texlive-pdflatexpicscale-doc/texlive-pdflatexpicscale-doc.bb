SUMMARY = "Documentation for texlive-pdflatexpicscale"
DESCRIPTION = "This package includes the documentation for texlive-pdflatexpicscale"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.32svn46617"

RPM_NAME = "texlive-pdflatexpicscale-doc-2023.201.0.0.32svn46617-51.1.noarch.rpm"
RPM_HASH = "6cfba939f457efe224a3b0f74b65504849cdcb0bc485137f7aec9b1c2ceb7a89cc802eb47814fd0370f1a7d1129dab8568ab592188cb4a05afd2ffcf778892c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdflatexpicscale-doc"
RDEPENDS:${PN} += ""

inherit rpm
