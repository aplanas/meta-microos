SUMMARY = "Documentation for texlive-fancyslides"
DESCRIPTION = "This package includes the documentation for texlive-fancyslides"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn36263"

RPM_NAME = "texlive-fancyslides-doc-2023.201.1.0svn36263-52.1.noarch.rpm"
RPM_HASH = "dcc9dcaa7e91b273cbb29165016c78019557297b359c1985f1ea65091087266cfd5e344a15c6d6125030a22e8a30a1e75b0c834b634f6402138dad4148fdb0bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fancyslides-doc"
RDEPENDS:${PN} += ""

inherit rpm
