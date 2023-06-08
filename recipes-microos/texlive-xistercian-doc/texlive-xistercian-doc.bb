SUMMARY = "Documentation for texlive-xistercian"
DESCRIPTION = "This package includes the documentation for texlive-xistercian"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn61366"

RPM_NAME = "texlive-xistercian-doc-2023.201.1.2svn61366-52.1.noarch.rpm"
RPM_HASH = "2755eb351ece3e607842379033156fb7ec209f65a9f55c8269da718a5ed63a9628077233d4ebe23f0cb75333c1308de2e1506a2b759298c0e37d634271abc099"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xistercian-doc"
RDEPENDS:${PN} += ""

inherit rpm
