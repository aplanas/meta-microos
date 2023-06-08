SUMMARY = "Documentation for texlive-lroundrect"
DESCRIPTION = "This package includes the documentation for texlive-lroundrect"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn39804"

RPM_NAME = "texlive-lroundrect-doc-2023.201.1.0svn39804-54.1.noarch.rpm"
RPM_HASH = "1500e6fd459319465adb25ee549ca13dc6f89b497477b8997ce791947bbfe540d2df9b01e1cd6e687651571af0df22332278e1827b2e0565863ffbf67ee2d693"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lroundrect-doc"
RDEPENDS:${PN} += ""

inherit rpm
