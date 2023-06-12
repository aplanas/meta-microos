SUMMARY = "Documentation for texlive-autobreak"
DESCRIPTION = "This package includes the documentation for texlive-autobreak"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn43337"

RPM_NAME = "texlive-autobreak-doc-2023.201.0.0.3svn43337-53.1.noarch.rpm"
RPM_HASH = "929818b297a2acd99b68e31454673233efd9504abee8ace3d3fb701e91c754ea707b8470f1c7500fe7bc932328a06fc4b10e0a5185367f46b14fb81f3f29e880"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-autobreak-doc:en) \
texlive-autobreak-doc"
RDEPENDS:${PN} += ""

inherit rpm
