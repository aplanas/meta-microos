SUMMARY = "Documentation for texlive-embedall"
DESCRIPTION = "This package includes the documentation for texlive-embedall"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn51177"

RPM_NAME = "texlive-embedall-doc-2023.201.2.0svn51177-53.1.noarch.rpm"
RPM_HASH = "9673496cd0e3af1f16ddfe0fedb820130250a251d8933bc48f58b0d1557a766298075a0a107f04e67a9473ea14aa32304ca9009daa92245a560b1a1dc2fbd0fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-embedall-doc"
RDEPENDS:${PN} += ""

inherit rpm
