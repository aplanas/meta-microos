SUMMARY = "Documentation for texlive-interactiveworkbook"
DESCRIPTION = "This package includes the documentation for texlive-interactiveworkbook"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-interactiveworkbook-doc-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "6a2620ade1c1f4d042ea381540102557d6a01ee62204efddce06318aec389417e53ffd1021a69351caaf315b44b56581d561849e7bcb698624f9456661b07921"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-interactiveworkbook-doc"
RDEPENDS:${PN} += ""

inherit rpm
