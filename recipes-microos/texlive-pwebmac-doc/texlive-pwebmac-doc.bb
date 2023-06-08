SUMMARY = "Documentation for texlive-pwebmac"
DESCRIPTION = "This package includes the documentation for texlive-pwebmac"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.4.8.1svn63731"

RPM_NAME = "texlive-pwebmac-doc-2023.201.4.8.1svn63731-53.1.noarch.rpm"
RPM_HASH = "a96e971e1d0e16b25bd21e3dca6ff19958a5756ca4c0944a5e7a6ffec47ab70096ed1c5506da75d3fec6b5bc5478efe4bb404671b1bf5255f2374b2d4f1c7922"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pwebmac-doc"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
