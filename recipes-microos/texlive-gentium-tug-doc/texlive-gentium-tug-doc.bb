SUMMARY = "Documentation for texlive-gentium-tug"
DESCRIPTION = "This package includes the documentation for texlive-gentium-tug"
LICENSE = "OFL-1.1"

PV = "2023.201.1.102svn63470"

RPM_NAME = "texlive-gentium-tug-doc-2023.201.1.102svn63470-52.1.noarch.rpm"
RPM_HASH = "bfe359d6cefb5f1281bbbff6b28480de715ab4a7d3dc2622d9d0636a38ed74f168fa2c94f93bf08465480c6d444bbf7a73152fb90e56fa8c841d9bb2a7286584"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gentium-tug-doc"
RDEPENDS:${PN} += "/usr/bin/python"

inherit rpm
