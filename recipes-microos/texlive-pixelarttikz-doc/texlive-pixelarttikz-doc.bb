SUMMARY = "Documentation for texlive-pixelarttikz"
DESCRIPTION = "This package includes the documentation for texlive-pixelarttikz"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1.0svn65649"

RPM_NAME = "texlive-pixelarttikz-doc-2023.201.0.0.1.0svn65649-51.1.noarch.rpm"
RPM_HASH = "6e0f27e0d82a275df304203e9b046da275abc7bea4041c79882bc7b71f86a7f7dc9701b1dfd1604f8ea488e14e476930be40784445174b666a947dc2424e72f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-pixelarttikz-doc:fr) texlive-pixelarttikz-doc"
RDEPENDS:${PN} += ""

inherit rpm
