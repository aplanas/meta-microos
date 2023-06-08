SUMMARY = "Documentation for texlive-fltpoint"
DESCRIPTION = "This package includes the documentation for texlive-fltpoint"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1bsvn56594"

RPM_NAME = "texlive-fltpoint-doc-2023.201.1.1bsvn56594-52.1.noarch.rpm"
RPM_HASH = "59bcbbeab5768e9fb1fc720e9571a5a9a96f4062143604d5b1f7050d950211de72336f5d8ab87a20e71ec3fc5fc229926fd60675f433244240d9a34748789c95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fltpoint-doc"
RDEPENDS:${PN} += ""

inherit rpm
