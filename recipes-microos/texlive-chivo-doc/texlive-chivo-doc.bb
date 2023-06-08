SUMMARY = "Documentation for texlive-chivo"
DESCRIPTION = "This package includes the documentation for texlive-chivo"
LICENSE = "OFL-1.1"

PV = "2023.201.2.2svn65029"

RPM_NAME = "texlive-chivo-doc-2023.201.2.2svn65029-53.1.noarch.rpm"
RPM_HASH = "daf4d3d996afc4d4c2138597f475d563d6f7a356f13d03c0d57db618327fc43b227c81fed3fc119753f608a0286244109398b4947c7a553ad3db309c167c62bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chivo-doc"
RDEPENDS:${PN} += ""

inherit rpm
