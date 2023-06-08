SUMMARY = "Documentation for texlive-casyl"
DESCRIPTION = "This package includes the documentation for texlive-casyl"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.2.0svn15878"

RPM_NAME = "texlive-casyl-doc-2023.201.2.0svn15878-52.1.noarch.rpm"
RPM_HASH = "10862489ce4f4e58b2f8490e630130df97120d1fde57087bc1bc762a21aa418df14b19e3de8fe93a3c08e515d2d93cdebead7f3db84fd31cd0cb5eecb3f05445"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-casyl-doc"
RDEPENDS:${PN} += ""

inherit rpm
