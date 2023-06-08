SUMMARY = "Documentation for texlive-playfair"
DESCRIPTION = "This package includes the documentation for texlive-playfair"
LICENSE = "OFL-1.1"

PV = "2023.201.svn64857"

RPM_NAME = "texlive-playfair-doc-2023.201.svn64857-52.1.noarch.rpm"
RPM_HASH = "09cb5baef331ec1ac8c6036c2252436f6766b8c31c068e6aec384f7d5650580040bf914e4eb7cb655dc514d42993f9a9af4d728847db8b441f532b905f1c8cbf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-playfair-doc"
RDEPENDS:${PN} += ""

inherit rpm
