SUMMARY = "Documentation for texlive-lcyw"
DESCRIPTION = "This package includes the documentation for texlive-lcyw"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn15878"

RPM_NAME = "texlive-lcyw-doc-2023.201.1.1svn15878-54.1.noarch.rpm"
RPM_HASH = "6441c708148234e63aae07c6fcb9245826000716adb06b116a3209d7f0c0129691d9f5cd54b8c936cf660a985259783cbe8aadf70a144988f8580d173b30f64a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lcyw-doc"
RDEPENDS:${PN} += ""

inherit rpm
