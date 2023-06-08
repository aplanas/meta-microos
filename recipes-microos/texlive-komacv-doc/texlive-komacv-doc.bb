SUMMARY = "Documentation for texlive-komacv"
DESCRIPTION = "This package includes the documentation for texlive-komacv"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1.2svn57721"

RPM_NAME = "texlive-komacv-doc-2023.201.1.1.2svn57721-55.1.noarch.rpm"
RPM_HASH = "b1982262a1013fee27860444a08d6b9be12d679f30194bd160379a262680d25930e6b6cf798b687bf8cc18b0af2b342f215960fbfeb7ff5d0ac39af007a96c03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-komacv-doc"
RDEPENDS:${PN} += ""

inherit rpm
