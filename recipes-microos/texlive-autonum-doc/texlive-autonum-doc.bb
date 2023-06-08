SUMMARY = "Documentation for texlive-autonum"
DESCRIPTION = "This package includes the documentation for texlive-autonum"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3.11svn36084"

RPM_NAME = "texlive-autonum-doc-2023.201.0.0.3.11svn36084-53.1.noarch.rpm"
RPM_HASH = "272a874eeb343ae468bade7c65290631f8fdfed5d791745dbe30aeec2bcfbf7557b47b0d6e4d0af996c9f6801ca991f7c9c9d2c893da70b76c9cc4711841afcb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-autonum-doc"
RDEPENDS:${PN} += ""

inherit rpm
