SUMMARY = "Documentation for texlive-acroterm"
DESCRIPTION = "This package includes the documentation for texlive-acroterm"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn61719"

RPM_NAME = "texlive-acroterm-doc-2023.201.0.0.1svn61719-54.1.noarch.rpm"
RPM_HASH = "87990a66ed6e90fbb97eba34b37f3eb4c04682e7cdb4d3f71215827d0544bcfff3a29eadd3df58e821b36d4e6e43b5b0670a37265d6b9876b513470bb77d4788"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-acroterm-doc"
RDEPENDS:${PN} += ""

inherit rpm
