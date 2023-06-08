SUMMARY = "Documentation for texlive-ctanbib"
DESCRIPTION = "This package includes the documentation for texlive-ctanbib"
LICENSE = "LPPL-1.0"

PV = "2023.204.0.0.2bsvn66068"

RPM_NAME = "texlive-ctanbib-doc-2023.204.0.0.2bsvn66068-54.1.noarch.rpm"
RPM_HASH = "86091f6dd5154b885c399647f5d8127dd518ae8fdd115565f581327d63d3515744d33411c6faa7822c5eb7d943f64efd08c7582ed1efc7c1f2918b9f52cd6db3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(ctanbib.1) texlive-ctanbib-doc"
RDEPENDS:${PN} += ""

inherit rpm
