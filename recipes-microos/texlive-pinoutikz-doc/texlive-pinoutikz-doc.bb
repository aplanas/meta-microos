SUMMARY = "Documentation for texlive-pinoutikz"
DESCRIPTION = "This package includes the documentation for texlive-pinoutikz"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1.2svn55966"

RPM_NAME = "texlive-pinoutikz-doc-2023.201.1.1.2svn55966-51.1.noarch.rpm"
RPM_HASH = "44ce873956c1fb5170b57e9d5c89f374e300b5a1d2751a849a3c711c43b4a692d9a08cc80eb8092953528e47d5d963960f96632f531621b1197111dbe0faf196"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pinoutikz-doc"
RDEPENDS:${PN} += ""

inherit rpm
