SUMMARY = "Documentation for texlive-namespc"
DESCRIPTION = "This package includes the documentation for texlive-namespc"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-namespc-doc-2023.201.svn15878-54.1.noarch.rpm"
RPM_HASH = "62cecfcfc59aa2d2cc8aaad76854893dca91f4c13834d9691d8b2cf9eae7304e6a5909905ca89722d39e83b253b0035f28bea27ed532903cf07c61b9ac0154e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-namespc-doc"
RDEPENDS:${PN} += ""

inherit rpm
