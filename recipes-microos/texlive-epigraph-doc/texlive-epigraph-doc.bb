SUMMARY = "Documentation for texlive-epigraph"
DESCRIPTION = "This package includes the documentation for texlive-epigraph"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5esvn54857"

RPM_NAME = "texlive-epigraph-doc-2023.201.1.5esvn54857-53.1.noarch.rpm"
RPM_HASH = "8e249593db425daac07f05a74d7da897f6f9e772db3b01b1104e5e8ec52a0c588ec5e7771613d15704d203facad7146cca6ea6afef0132a91e575b17bc4cdeaa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-epigraph-doc"
RDEPENDS:${PN} += ""

inherit rpm
