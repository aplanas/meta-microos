SUMMARY = "Documentation for texlive-bookest"
DESCRIPTION = "This package includes the documentation for texlive-bookest"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn15878"

RPM_NAME = "texlive-bookest-doc-2023.201.1.1svn15878-52.1.noarch.rpm"
RPM_HASH = "aae784241aa31866500581d55472cfd8d0c9d339b9104c4a644525969b148de74ec1f387e83d603c8bd2569577d973e03e90430a4b68b5998ec5b1a07c2ce6a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-bookest-doc:en;it) texlive-bookest-doc"
RDEPENDS:${PN} += ""

inherit rpm
