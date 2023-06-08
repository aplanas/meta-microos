SUMMARY = "Documentation for texlive-apa"
DESCRIPTION = "This package includes the documentation for texlive-apa"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3.4svn54080"

RPM_NAME = "texlive-apa-doc-2023.201.1.3.4svn54080-54.1.noarch.rpm"
RPM_HASH = "d1d11863bc0b11715f41599d810070e6ec36c8205ca4853d769d5ee4aa674e58e2dd9cb63f4e3a05d7b0ba78ee1f7a6fbf9a40116d3c3d19656738d31c398320"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-apa-doc"
RDEPENDS:${PN} += ""

inherit rpm
