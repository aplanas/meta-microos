SUMMARY = "Documentation for texlive-mluexercise"
DESCRIPTION = "This package includes the documentation for texlive-mluexercise"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn56927"

RPM_NAME = "texlive-mluexercise-doc-2023.201.2.0svn56927-54.1.noarch.rpm"
RPM_HASH = "813f98be8ad4608bf5e0e4cd4ef7154c2a0fb6b5c1384a20b4df682bd083ac133224d5a08096db73985311d922d183f443fde6075885d9c25413abf81159dbd7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mluexercise-doc"
RDEPENDS:${PN} += ""

inherit rpm
