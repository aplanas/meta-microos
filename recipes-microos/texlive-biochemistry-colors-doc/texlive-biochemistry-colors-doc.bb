SUMMARY = "Documentation for texlive-biochemistry-colors"
DESCRIPTION = "This package includes the documentation for texlive-biochemistry-colors"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.00svn54512"

RPM_NAME = "texlive-biochemistry-colors-doc-2023.201.1.00svn54512-53.1.noarch.rpm"
RPM_HASH = "8c796c8d66129199b271d7013e08037421734a6c096fd8c0ecfa4a63547931bfe3867b4154ccee275c8c4ed6f59cf4d0b18bf120d25649d711298a4a99b41cea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biochemistry-colors-doc"
RDEPENDS:${PN} += ""

inherit rpm
