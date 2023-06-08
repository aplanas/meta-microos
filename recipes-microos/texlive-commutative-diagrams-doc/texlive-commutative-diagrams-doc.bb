SUMMARY = "Documentation for texlive-commutative-diagrams"
DESCRIPTION = "This package includes the documentation for texlive-commutative-diagrams"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.1svn55526"

RPM_NAME = "texlive-commutative-diagrams-doc-2023.201.1.0.1svn55526-53.1.noarch.rpm"
RPM_HASH = "7d7857f12922c4373d74d85f949384dc993b92f31c32bd9c5dd71c79ede05e8805d3de5c06e4cd8863ff631dc9392db4eb18122ae543325a28edb3cf7dbda5d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-commutative-diagrams-doc"
RDEPENDS:${PN} += ""

inherit rpm
