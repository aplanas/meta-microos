SUMMARY = "Documentation for texlive-reverxii"
DESCRIPTION = "This package includes the documentation for texlive-reverxii"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn63753"

RPM_NAME = "texlive-reverxii-doc-2023.201.svn63753-53.1.noarch.rpm"
RPM_HASH = "0c6cb57b2da7ea43542d76e568f5b7826eeec6edda66febe9552f654d5ccfc24227c0ba4411ea9faf3bd9a2361a076ba985e2f6345ba21dad7172e1888d866e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-reverxii-doc"
RDEPENDS:${PN} += ""

inherit rpm
