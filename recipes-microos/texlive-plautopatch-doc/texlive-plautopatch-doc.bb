SUMMARY = "Documentation for texlive-plautopatch"
DESCRIPTION = "This package includes the documentation for texlive-plautopatch"
LICENSE = "BSD-3-Clause"

PV = "2023.201.0.0.9qsvn64072"

RPM_NAME = "texlive-plautopatch-doc-2023.201.0.0.9qsvn64072-52.1.noarch.rpm"
RPM_HASH = "10ab4a9721e0d3c2ee4dfb210555be990d48648b2d2b8c04586734274ffe5c5c3c9255af679b279670e2460ef17e2d25e4a7b3cbfe1f52da243697c6e85e6d32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-plautopatch-doc:ja) \
texlive-plautopatch-doc"
RDEPENDS:${PN} += ""

inherit rpm
