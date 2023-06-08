SUMMARY = "Documentation for texlive-suppose"
DESCRIPTION = "This package includes the documentation for texlive-suppose"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2.2svn59281"

RPM_NAME = "texlive-suppose-doc-2023.201.1.2.2svn59281-57.1.noarch.rpm"
RPM_HASH = "ce5529c1ed6209bf982701c0910f961ab44629e2ac6e02bae6a20fdaeef77ec6f77438b6e0887e83acfdb13199b423d04ea5ca5a37a6cd98af4035f856ac12c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-suppose-doc"
RDEPENDS:${PN} += ""

inherit rpm
