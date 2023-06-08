SUMMARY = "Documentation for texlive-fontaxes"
DESCRIPTION = "This package includes the documentation for texlive-fontaxes"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0esvn55920"

RPM_NAME = "texlive-fontaxes-doc-2023.201.1.0esvn55920-52.1.noarch.rpm"
RPM_HASH = "91daeeb1c7c838fa8411c9550d7f18eeb373bad8641ef6c5d32e903dabc7cf3b93f5c953d9371734986b1688ede84666a1f7dfdd708c7789c231ea05b58b936d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fontaxes-doc"
RDEPENDS:${PN} += ""

inherit rpm
