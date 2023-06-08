SUMMARY = "Documentation for texlive-latexmp"
DESCRIPTION = "This package includes the documentation for texlive-latexmp"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.2.1svn55643"

RPM_NAME = "texlive-latexmp-doc-2023.201.1.2.1svn55643-54.1.noarch.rpm"
RPM_HASH = "0b23c6bcd11ad9fa81d6fc3c8e8a4ea1642522910f78aa7b38b3d27e94f8937bf47857424ddc36d1c4004d8f74e5a5fcf736943f850814a4d533ad0d706e8a55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latexmp-doc"
RDEPENDS:${PN} += ""

inherit rpm
