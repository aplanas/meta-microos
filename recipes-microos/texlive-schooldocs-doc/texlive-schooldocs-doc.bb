SUMMARY = "Documentation for texlive-schooldocs"
DESCRIPTION = "This package includes the documentation for texlive-schooldocs"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn65650"

RPM_NAME = "texlive-schooldocs-doc-2023.201.1.2svn65650-53.1.noarch.rpm"
RPM_HASH = "2ce13b6b582e416d61d02acf20257737a2f11a7319199a0ad098df83a33bfdb791ce98a8dab0daf7968cdd31611d72b44818cd8987ea838760fe019af5a7654b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-schooldocs-doc"
RDEPENDS:${PN} += ""

inherit rpm
