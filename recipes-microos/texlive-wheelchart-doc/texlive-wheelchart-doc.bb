SUMMARY = "Documentation for texlive-wheelchart"
DESCRIPTION = "This package includes the documentation for texlive-wheelchart"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn64373"

RPM_NAME = "texlive-wheelchart-doc-2023.201.1.0svn64373-53.1.noarch.rpm"
RPM_HASH = "86272ff1caa1093b6058836a38bb419bb97b2aab9814d15b737e252afc8ab6d205c9574b091a691127011efd88a3bb98a7041a4b0a881f1028e5092cca2b8272"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-wheelchart-doc"
RDEPENDS:${PN} += ""

inherit rpm
