SUMMARY = "Documentation for texlive-tex-label"
DESCRIPTION = "This package includes the documentation for texlive-tex-label"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn16372"

RPM_NAME = "texlive-tex-label-doc-2023.201.svn16372-54.1.noarch.rpm"
RPM_HASH = "70c6604c1f1c9ba9a94c2d26f91ae2875b4cc004087b2dd6bf688c2d1b2c9a67cb5e07e21e1040258a865ae9c2210006b5cffd5a156c46ed87177aa47a506f51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tex-label-doc"
RDEPENDS:${PN} += ""

inherit rpm
