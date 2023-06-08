SUMMARY = "Documentation for texlive-eledform"
DESCRIPTION = "This package includes the documentation for texlive-eledform"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1asvn38114"

RPM_NAME = "texlive-eledform-doc-2023.201.1.1asvn38114-53.1.noarch.rpm"
RPM_HASH = "7b30ebf73b1e07e185b3657ed3d5f07fa2be17a9aaa919c70e74a6aa813da7c6db4651f3abdb683b9bc85c49d6321a1ff1e8b2bd9cfb69b027892d6bdba14843"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eledform-doc"
RDEPENDS:${PN} += ""

inherit rpm
