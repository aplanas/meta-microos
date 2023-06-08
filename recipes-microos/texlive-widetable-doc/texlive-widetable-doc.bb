SUMMARY = "Documentation for texlive-widetable"
DESCRIPTION = "This package includes the documentation for texlive-widetable"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1svn53409"

RPM_NAME = "texlive-widetable-doc-2023.201.2.1svn53409-53.1.noarch.rpm"
RPM_HASH = "5bcf41b5a2ec9325103471a51a6f3089913593271f90c20d36f4916930aada4e1d29f2e4dc2e4f391d2480b7e28619ef16ddea777864e9ae350cb2220f1499be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-widetable-doc"
RDEPENDS:${PN} += ""

inherit rpm
