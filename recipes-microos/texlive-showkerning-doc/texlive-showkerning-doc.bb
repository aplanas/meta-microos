SUMMARY = "Documentation for texlive-showkerning"
DESCRIPTION = "This package includes the documentation for texlive-showkerning"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn63708"

RPM_NAME = "texlive-showkerning-doc-2023.201.0.0.1svn63708-53.1.noarch.rpm"
RPM_HASH = "a112a3d36282fca1e2277fed9edb5fc43cb70ab7d5e80378f0d1f838f624137d5cacc31b2bdbe5dbf32794e5e9263b6e0ddfbf9b43bffa0a06f65d33f60318ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-showkerning-doc"
RDEPENDS:${PN} += ""

inherit rpm
