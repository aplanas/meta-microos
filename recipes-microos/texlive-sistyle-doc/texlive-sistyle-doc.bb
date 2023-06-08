SUMMARY = "Documentation for texlive-sistyle"
DESCRIPTION = "This package includes the documentation for texlive-sistyle"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.3asvn59682"

RPM_NAME = "texlive-sistyle-doc-2023.201.2.3asvn59682-57.1.noarch.rpm"
RPM_HASH = "fe5b1284cac6e06f53783be18a78ef2572523c667e978f2aee9a4128a9c22ee2b87c415c55ed3e3698cefe0c5158753571ffc15d7ee6011eecac45c0a73ea5d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sistyle-doc"
RDEPENDS:${PN} += ""

inherit rpm
