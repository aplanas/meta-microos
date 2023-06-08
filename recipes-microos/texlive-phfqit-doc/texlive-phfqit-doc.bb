SUMMARY = "Documentation for texlive-phfqit"
DESCRIPTION = "This package includes the documentation for texlive-phfqit"
LICENSE = "LPPL-1.0"

PV = "2023.201.4.1svn60734"

RPM_NAME = "texlive-phfqit-doc-2023.201.4.1svn60734-51.1.noarch.rpm"
RPM_HASH = "d6b6062c1fe5fbbb8a9c7db64114a36ba8d60c89f85c3fadaefbcbfaa29aa5f20c5e9a1e091a0f813d9efa264c372b4f13006a0011c4df42d99beb06f7af9d79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-phfqit-doc"
RDEPENDS:${PN} += ""

inherit rpm
