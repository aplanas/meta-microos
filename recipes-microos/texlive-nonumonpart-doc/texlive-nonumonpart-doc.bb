SUMMARY = "Documentation for texlive-nonumonpart"
DESCRIPTION = "This package includes the documentation for texlive-nonumonpart"
LICENSE = "LPPL-1.0"

PV = "2023.201.1svn22114"

RPM_NAME = "texlive-nonumonpart-doc-2023.201.1svn22114-54.1.noarch.rpm"
RPM_HASH = "cc514844c999f0c631b75535aad85e3869a20dbbcd8a0a25215a7cc438d6d45a432e495ec11f5492c5fc2470d4c52958bce5a5e9425e1c462634eb577b776208"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-nonumonpart-doc:fr;en) texlive-nonumonpart-doc"
RDEPENDS:${PN} += ""

inherit rpm
