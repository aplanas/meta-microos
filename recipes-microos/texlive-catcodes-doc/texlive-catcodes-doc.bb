SUMMARY = "Documentation for texlive-catcodes"
DESCRIPTION = "This package includes the documentation for texlive-catcodes"
LICENSE = "LPPL-1.0"

PV = "2023.201.r0.2svn38859"

RPM_NAME = "texlive-catcodes-doc-2023.201.r0.2svn38859-52.1.noarch.rpm"
RPM_HASH = "5777212fb8b3d5a9bb42a9ec8b862612825d3625c2b24bc76b83acbc63fadbf1bab328cc8a66eb6d9f61799c797041a9e4cb6102475020012426c93934525a63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-catcodes-doc"
RDEPENDS:${PN} += ""

inherit rpm
