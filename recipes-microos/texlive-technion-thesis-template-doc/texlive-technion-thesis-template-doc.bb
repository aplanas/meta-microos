SUMMARY = "Documentation for texlive-technion-thesis-template"
DESCRIPTION = "This package includes the documentation for texlive-technion-thesis-template"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn49889"

RPM_NAME = "texlive-technion-thesis-template-doc-2023.201.1.0svn49889-54.1.noarch.rpm"
RPM_HASH = "94069b1e95565ec9fd2559c6f803da755533d723fdec6c0e87d66edefea357d3466b361143c0d5cf92550383b13df54e7cafbc34d41e7fa7e17dc4ca574d15c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-technion-thesis-template-doc"
RDEPENDS:${PN} += ""

inherit rpm
