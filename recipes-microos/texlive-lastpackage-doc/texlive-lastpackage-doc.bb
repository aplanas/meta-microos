SUMMARY = "Documentation for texlive-lastpackage"
DESCRIPTION = "This package includes the documentation for texlive-lastpackage"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn34481"

RPM_NAME = "texlive-lastpackage-doc-2023.201.0.0.1svn34481-55.1.noarch.rpm"
RPM_HASH = "52b9de4985c1ede7604463b9c2d6f324bd2376050bf0150a872c0329049cd478474a3c286ee2e27b78387213708f0e018b9b2e6f3f53412e2a70f1a6038c68cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lastpackage-doc"
RDEPENDS:${PN} += ""

inherit rpm
