SUMMARY = "Documentation for texlive-beamerthemenirma"
DESCRIPTION = "This package includes the documentation for texlive-beamerthemenirma"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn20765"

RPM_NAME = "texlive-beamerthemenirma-doc-2023.201.0.0.1svn20765-53.1.noarch.rpm"
RPM_HASH = "83ec4de0faa4d149ae0f2acce3b19686477edd37a7d98ec04aa2d51f07de188c7cd1282d2e38dfb15d9f873e7040a82ac696443fa64c41398a206c01ed1e2435"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamerthemenirma-doc"
RDEPENDS:${PN} += ""

inherit rpm
