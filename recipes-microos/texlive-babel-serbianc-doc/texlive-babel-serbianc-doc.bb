SUMMARY = "Documentation for texlive-babel-serbianc"
DESCRIPTION = "This package includes the documentation for texlive-babel-serbianc"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.2asvn64588"

RPM_NAME = "texlive-babel-serbianc-doc-2023.201.3.2asvn64588-53.1.noarch.rpm"
RPM_HASH = "2c7b69ed612fd61d6c7d4f9e7997d57267d85c382d938315d01a9d81fd7d64693ca21e85b0c3a3138532af35b9f9e52269ea932170021cb126f46090d9bb2cd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-serbianc-doc"
RDEPENDS:${PN} += ""

inherit rpm
