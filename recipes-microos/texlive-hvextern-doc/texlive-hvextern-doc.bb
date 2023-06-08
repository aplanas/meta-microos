SUMMARY = "Documentation for texlive-hvextern"
DESCRIPTION = "This package includes the documentation for texlive-hvextern"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.33svn65670"

RPM_NAME = "texlive-hvextern-doc-2023.201.0.0.33svn65670-52.1.noarch.rpm"
RPM_HASH = "a2c5d469e798345e8f4dc7aa6cc6dc0f30d237d3ea531e528582789363087bf87840de193c5da6853b57370b643c928535c3c7f55e9ffda3bb3ac4dc77df9742"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hvextern-doc"
RDEPENDS:${PN} += ""

inherit rpm
