SUMMARY = "Documentation for texlive-babel-slovak"
DESCRIPTION = "This package includes the documentation for texlive-babel-slovak"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.1asvn30292"

RPM_NAME = "texlive-babel-slovak-doc-2023.201.3.1asvn30292-53.1.noarch.rpm"
RPM_HASH = "330c7e1b872e33bf49827f4b7bd9fd0b1165bdc35f7ccbaf9c292d17e861d66cead177a066f7136b24b6f029ba46886e23bc0ff92a56568794578447dce2d0a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-slovak-doc"
RDEPENDS:${PN} += ""

inherit rpm
