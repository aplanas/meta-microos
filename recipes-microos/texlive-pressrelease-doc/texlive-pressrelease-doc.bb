SUMMARY = "Documentation for texlive-pressrelease"
DESCRIPTION = "This package includes the documentation for texlive-pressrelease"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn35147"

RPM_NAME = "texlive-pressrelease-doc-2023.201.1.0svn35147-52.1.noarch.rpm"
RPM_HASH = "efee54fdcc0be4b8957e82d79a1f6b79cb990fc754df2f438b9e327218129937349e51356d1dedce672143be2dbf00abae793a530975530af2e820275b70692d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pressrelease-doc"
RDEPENDS:${PN} += ""

inherit rpm
