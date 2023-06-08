SUMMARY = "Documentation for texlive-pst-lens"
DESCRIPTION = "This package includes the documentation for texlive-pst-lens"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.02svn15878"

RPM_NAME = "texlive-pst-lens-doc-2023.201.1.02svn15878-52.1.noarch.rpm"
RPM_HASH = "d2d8ec48460bf06701916c40a5e9847c8527fa292f8d613b8608943902e44718823c067cd4cb11c0f9b8a4921b505636b6b31e44d939bcb55486a08ca45dd716"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-lens-doc"
RDEPENDS:${PN} += ""

inherit rpm
