SUMMARY = "Documentation for texlive-sdaps"
DESCRIPTION = "This package includes the documentation for texlive-sdaps"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.9.10svn65345"

RPM_NAME = "texlive-sdaps-doc-2023.201.1.9.10svn65345-53.1.noarch.rpm"
RPM_HASH = "cf88cfefd5b0eac1c5b9be01233d2f258d2481561424c1a8e35f2c3ebc520ad27bdd4f15308e4d2b90bcbc9449aa6dbbf0629e1043d87921722b7a088f53cc5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sdaps-doc"
RDEPENDS:${PN} += ""

inherit rpm
