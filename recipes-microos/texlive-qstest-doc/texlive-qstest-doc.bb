SUMMARY = "Documentation for texlive-qstest"
DESCRIPTION = "This package includes the documentation for texlive-qstest"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-qstest-doc-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "90ace280b58e07e12a8d3960cf14fd1dcf021edc8b5c9ea74a4bbd48f971eadd00292eac77f69701b6969488f2a224a2c1052ffaad8f2d05b56f8c9d125c7b01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-qstest-doc"
RDEPENDS:${PN} += ""

inherit rpm
