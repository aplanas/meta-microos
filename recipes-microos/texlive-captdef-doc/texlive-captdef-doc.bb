SUMMARY = "Documentation for texlive-captdef"
DESCRIPTION = "This package includes the documentation for texlive-captdef"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn17353"

RPM_NAME = "texlive-captdef-doc-2023.201.svn17353-52.1.noarch.rpm"
RPM_HASH = "a6a7019319a9b5bc5d9eb76b3d26d086089b661a7d6685823d8f68fe52e30affad69aeb6602ecda326fb79447a4d47ce57423d4be744dd13403774eb8081cabc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-captdef-doc"
RDEPENDS:${PN} += ""

inherit rpm
