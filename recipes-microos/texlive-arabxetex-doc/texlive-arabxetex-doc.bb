SUMMARY = "Documentation for texlive-arabxetex"
DESCRIPTION = "This package includes the documentation for texlive-arabxetex"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2.1svn38299"

RPM_NAME = "texlive-arabxetex-doc-2023.201.1.2.1svn38299-54.1.noarch.rpm"
RPM_HASH = "47b4e702c00a5db6a0c61e404763cf8811e50d1eb1ad6c45e4b02c98a977328682f7fa917943b452e3b22e0ccf01eaf7452a9f368cd52c6395ac7eba32e366f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-arabxetex-doc"
RDEPENDS:${PN} += ""

inherit rpm
