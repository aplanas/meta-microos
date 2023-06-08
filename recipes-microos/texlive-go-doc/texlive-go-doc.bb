SUMMARY = "Documentation for texlive-go"
DESCRIPTION = "This package includes the documentation for texlive-go"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn28628"

RPM_NAME = "texlive-go-doc-2023.201.svn28628-53.1.noarch.rpm"
RPM_HASH = "d10df99d7b0691eb8c2c19a4fb91e54d13871446a35a1ce4a5e38209d6809d624aa6fef84d89f97573f39f78f5fd07f17068fb5cf07d2771be9d43895d38139e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-go-doc"
RDEPENDS:${PN} += ""

inherit rpm
