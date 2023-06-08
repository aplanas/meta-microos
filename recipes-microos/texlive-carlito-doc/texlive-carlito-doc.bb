SUMMARY = "Documentation for texlive-carlito"
DESCRIPTION = "This package includes the documentation for texlive-carlito"
LICENSE = "OFL-1.1"

PV = "2023.201.svn64624"

RPM_NAME = "texlive-carlito-doc-2023.201.svn64624-52.1.noarch.rpm"
RPM_HASH = "cccb52e34c39c34ce595b44423ef0a8680336996888eafeb08d6c3797d89fd4f3c93956e0980ea2c40860d31374f4a97db02cddcbbc01bfc155c6e0331f5a6c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-carlito-doc"
RDEPENDS:${PN} += ""

inherit rpm
