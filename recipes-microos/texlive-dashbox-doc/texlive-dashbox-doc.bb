SUMMARY = "Documentation for texlive-dashbox"
DESCRIPTION = "This package includes the documentation for texlive-dashbox"
LICENSE = "LPPL-1.0"

PV = "2023.204.1.14svn23425"

RPM_NAME = "texlive-dashbox-doc-2023.204.1.14svn23425-54.1.noarch.rpm"
RPM_HASH = "a551c4020970b1264542b33ffd85f747199f218059ae3a48b9405d721a8e67c153c197f39fdb3c87cf607234d18fb6813ecebcc2433bdd8d8ee53f91a2cffd95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dashbox-doc"
RDEPENDS:${PN} += ""

inherit rpm
