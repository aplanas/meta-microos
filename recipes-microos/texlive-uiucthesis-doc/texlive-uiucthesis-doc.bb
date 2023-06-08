SUMMARY = "Documentation for texlive-uiucthesis"
DESCRIPTION = "This package includes the documentation for texlive-uiucthesis"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.25svn15878"

RPM_NAME = "texlive-uiucthesis-doc-2023.201.2.25svn15878-53.1.noarch.rpm"
RPM_HASH = "766f84d0bd7ed96a515ba39f9c8712dacd07f89aec0a8c3b79b6bcc0da48e290ff6b1197699cf6903c9c9b593d97cd092353bf30e4c132886757e35d705dad41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uiucthesis-doc"
RDEPENDS:${PN} += ""

inherit rpm
