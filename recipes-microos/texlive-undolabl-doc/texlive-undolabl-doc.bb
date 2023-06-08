SUMMARY = "Documentation for texlive-undolabl"
DESCRIPTION = "This package includes the documentation for texlive-undolabl"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0msvn65846"

RPM_NAME = "texlive-undolabl-doc-2023.201.1.0msvn65846-53.1.noarch.rpm"
RPM_HASH = "3b85ac7d975b0ab7e262961b1b79f0bd8a5f72b12f9f56072268c77cf9a1d135ef85d33ed9e748d6085370db05cc7482ab969e33b652189a0784806142dc734b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-undolabl-doc"
RDEPENDS:${PN} += ""

inherit rpm
