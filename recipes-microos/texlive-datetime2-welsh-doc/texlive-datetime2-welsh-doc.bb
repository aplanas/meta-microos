SUMMARY = "Documentation for texlive-datetime2-welsh"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-welsh"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn52553"

RPM_NAME = "texlive-datetime2-welsh-doc-2023.201.1.1svn52553-52.1.noarch.rpm"
RPM_HASH = "fbb6f959fb673982b55f26b677e953af3e049e86626baea14c8ba5be05c4da2f60367792e8d361eed00d2834d5d72c141211752e2225e8ffaec35373074b700e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-welsh-doc"
RDEPENDS:${PN} += ""

inherit rpm
