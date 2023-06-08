SUMMARY = "Documentation for texlive-chklref"
DESCRIPTION = "This package includes the documentation for texlive-chklref"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.3.1.2svn52649"

RPM_NAME = "texlive-chklref-doc-2023.201.3.1.2svn52649-53.1.noarch.rpm"
RPM_HASH = "dea51582d602f97b573394f7a3928e629c49b76044dec84f112cbbda680f775b8b0ada4c7793a176e73eb31134452417ed39993a15e8e9700129196b83464e70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(chklref.1) texlive-chklref-doc"
RDEPENDS:${PN} += "/bin/bash"

inherit rpm
