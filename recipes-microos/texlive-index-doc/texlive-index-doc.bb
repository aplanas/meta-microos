SUMMARY = "Documentation for texlive-index"
DESCRIPTION = "This package includes the documentation for texlive-index"
LICENSE = "LPPL-1.0"

PV = "2023.201.4.1betasvn24099"

RPM_NAME = "texlive-index-doc-2023.201.4.1betasvn24099-52.1.noarch.rpm"
RPM_HASH = "150013598fda6a84ff851e9fc2a60842145a2a132f654656c229902cee5fed0fa54df05ce76ceb2bddd09f5b86cd1e6a5562de7512233f29e725ea4d09967f0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-index-doc"
RDEPENDS:${PN} += ""

inherit rpm
