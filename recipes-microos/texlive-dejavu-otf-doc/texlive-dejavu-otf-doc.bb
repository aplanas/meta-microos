SUMMARY = "Documentation for texlive-dejavu-otf"
DESCRIPTION = "This package includes the documentation for texlive-dejavu-otf"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.04svn45991"

RPM_NAME = "texlive-dejavu-otf-doc-2023.201.0.0.04svn45991-52.1.noarch.rpm"
RPM_HASH = "db36f09e0e0ff85ef043055ee5e61fd8114adedb9cedb8786a4e8c73252e9a6ae3d4633f36fa340903cc47873af432f9167b08bc8bac5f0e763b483a71878c93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dejavu-otf-doc"
RDEPENDS:${PN} += ""

inherit rpm
