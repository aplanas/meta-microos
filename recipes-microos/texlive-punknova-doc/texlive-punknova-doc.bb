SUMMARY = "Documentation for texlive-punknova"
DESCRIPTION = "This package includes the documentation for texlive-punknova"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.003svn24649"

RPM_NAME = "texlive-punknova-doc-2023.201.1.003svn24649-53.1.noarch.rpm"
RPM_HASH = "f4f17a8e757cfa2d4d0149ac78280a8c0d279d5f4b9d518c75c246a0c3c1b8eaf695c6f5bb27b2d211a7e2d325f258615d79b63a330766609219e2f4f4cbdfba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-punknova-doc"
RDEPENDS:${PN} += "/usr/bin/python3"

inherit rpm
