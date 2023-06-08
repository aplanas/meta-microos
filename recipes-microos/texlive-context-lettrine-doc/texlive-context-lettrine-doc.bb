SUMMARY = "Documentation for texlive-context-lettrine"
DESCRIPTION = "This package includes the documentation for texlive-context-lettrine"
LICENSE = "SUSE-Public-Domain"

PV = "2023.204.svn47085"

RPM_NAME = "texlive-context-lettrine-doc-2023.204.svn47085-54.1.noarch.rpm"
RPM_HASH = "edcdb9ea938bb24d79f674f89d925ef929bd760e2b9effe4e43b2f77cd41de790003da5f1d9969f319fb3cd9486135c54018b74f278a54889d3db7c237056955"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-lettrine-doc"
RDEPENDS:${PN} += ""

inherit rpm
