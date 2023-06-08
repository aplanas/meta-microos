SUMMARY = "Documentation for texlive-kanaparser"
DESCRIPTION = "This package includes the documentation for texlive-kanaparser"
LICENSE = "BSD-3-Clause"

PV = "2023.201.1.0svn48052"

RPM_NAME = "texlive-kanaparser-doc-2023.201.1.0svn48052-55.1.noarch.rpm"
RPM_HASH = "fae0b4aee7db022a51ce5be9f5cf5fcdf1963b844e04af95fb87d28f05396b24aa233faf939d8c34bbe9fc2d3ce81f53bc4b9b5fac47a998e5b91119c6f90f2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-kanaparser-doc"
RDEPENDS:${PN} += ""

inherit rpm
