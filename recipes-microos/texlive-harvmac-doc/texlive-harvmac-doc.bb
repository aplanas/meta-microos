SUMMARY = "Documentation for texlive-harvmac"
DESCRIPTION = "This package includes the documentation for texlive-harvmac"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-harvmac-doc-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "da1870acbf131fba52a1910adfc3d437a4cb6f673c8c660daab98ce9a9b6870791e2ddb96723a8a1da49ff04ed9e1790924b8496ac9f3f041a819e2b44aa6ef0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-harvmac-doc"
RDEPENDS:${PN} += ""

inherit rpm
