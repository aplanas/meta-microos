SUMMARY = "Documentation for texlive-colorframed"
DESCRIPTION = "This package includes the documentation for texlive-colorframed"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.9bsvn64551"

RPM_NAME = "texlive-colorframed-doc-2023.201.0.0.9bsvn64551-53.1.noarch.rpm"
RPM_HASH = "d620f1856e7413698433dd51f74bfc94d570f958ddd8ac8bbc0d9ddd7b2d47a0785793d59fd92fb1a97d5389c1dc675906747a4431257b1e932b99cef26273f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-colorframed-doc"
RDEPENDS:${PN} += ""

inherit rpm
