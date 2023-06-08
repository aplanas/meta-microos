SUMMARY = "Documentation for texlive-grid-system"
DESCRIPTION = "This package includes the documentation for texlive-grid-system"
LICENSE = "Apache-1.0"

PV = "2023.201.0.0.3.0svn32981"

RPM_NAME = "texlive-grid-system-doc-2023.201.0.0.3.0svn32981-53.1.noarch.rpm"
RPM_HASH = "1fbe62cc3762abf9a4053d20cf42a59495f08cfeba50fc7926c16136a4860c58b0404dbabd25435dc5a2f0f72e9d21ac3fec202e2f4d1982f6957125178eff6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-grid-system-doc"
RDEPENDS:${PN} += ""

inherit rpm
