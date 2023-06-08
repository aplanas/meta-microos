SUMMARY = "Documentation for texlive-erdc"
DESCRIPTION = "This package includes the documentation for texlive-erdc"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn15878"

RPM_NAME = "texlive-erdc-doc-2023.201.1.1svn15878-53.1.noarch.rpm"
RPM_HASH = "3f15c16ff1016966b10923f03624aa25b50cd987c9dc19458084718dbb29cc7c509409dd307af75191607e20512f528ed698034d14a443adba8abd8f87d63af0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-erdc-doc"
RDEPENDS:${PN} += ""

inherit rpm
