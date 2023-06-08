SUMMARY = "Documentation for texlive-causets"
DESCRIPTION = "This package includes the documentation for texlive-causets"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn66359"

RPM_NAME = "texlive-causets-doc-2023.201.1.4svn66359-52.1.noarch.rpm"
RPM_HASH = "cf864e0cd3e30d627dd27d91663ee99512dab3defa051232d5b6f7382e7090fcc5cab460cb36ea3111b97c17cc6ff19252df514239e9949ac00777f4e9e4b13c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-causets-doc"
RDEPENDS:${PN} += ""

inherit rpm
