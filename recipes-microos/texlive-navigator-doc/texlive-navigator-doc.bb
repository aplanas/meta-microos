SUMMARY = "Documentation for texlive-navigator"
DESCRIPTION = "This package includes the documentation for texlive-navigator"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn41413"

RPM_NAME = "texlive-navigator-doc-2023.201.1.1svn41413-54.1.noarch.rpm"
RPM_HASH = "44d2bce382c29c1df9e9917ffe72728614172004a200417b7cc6ab9261a0b264a97a6c5b1ba1b145e7e3076f8f7fd2bc44f6ec91b195a5554f9228a4ba02269b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-navigator-doc"
RDEPENDS:${PN} += ""

inherit rpm
