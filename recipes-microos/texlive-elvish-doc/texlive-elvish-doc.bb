SUMMARY = "Documentation for texlive-elvish"
DESCRIPTION = "This package includes the documentation for texlive-elvish"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-elvish-doc-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "1b0b30ec2250abbec52999e895f5ad46e3f50e63ecf37fc7de8c4e4f71d9565e93a55efc663a141ef1596beab2617d65558648e8167387a625fa0e33cab88489"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-elvish-doc"
RDEPENDS:${PN} += ""

inherit rpm
