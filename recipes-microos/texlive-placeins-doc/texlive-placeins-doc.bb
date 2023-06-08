SUMMARY = "Documentation for texlive-placeins"
DESCRIPTION = "This package includes the documentation for texlive-placeins"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.2.2svn19848"

RPM_NAME = "texlive-placeins-doc-2023.201.2.2svn19848-51.1.noarch.rpm"
RPM_HASH = "a3c6366d3fd3c07eed5cf91b602ad273c05946e5485e03fcdfe986c1f97d9edca0d28d04675f80b97555b5f588f804ed246e7db3ab81612d85dceb38bfb4f88d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-placeins-doc"
RDEPENDS:${PN} += ""

inherit rpm
