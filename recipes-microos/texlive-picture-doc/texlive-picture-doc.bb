SUMMARY = "Documentation for texlive-picture"
DESCRIPTION = "This package includes the documentation for texlive-picture"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.6svn54867"

RPM_NAME = "texlive-picture-doc-2023.201.1.6svn54867-51.1.noarch.rpm"
RPM_HASH = "d2f064a784bef369b3a86a4bc093f7dc66feaecb76cecdc1be2871c4e58f7e63a7af2e1d5fe5602f200739342fc91e1e7102941c2707ebeadc3c948de87ba992"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-picture-doc"
RDEPENDS:${PN} += ""

inherit rpm
