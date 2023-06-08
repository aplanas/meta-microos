SUMMARY = "Documentation for texlive-itnumpar"
DESCRIPTION = "This package includes the documentation for texlive-itnumpar"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-itnumpar-doc-2023.201.1.0svn15878-55.1.noarch.rpm"
RPM_HASH = "8c4e9f784848310c1ad5a0dcd05485b30018f1aec3e798df050a6fb74f114b9083aca7b0576da1327832960d2fecf462d9cab9446813a8692f8bb4f037ee2c9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-itnumpar-doc"
RDEPENDS:${PN} += ""

inherit rpm
