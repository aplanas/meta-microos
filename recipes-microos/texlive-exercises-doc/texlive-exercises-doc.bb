SUMMARY = "Documentation for texlive-exercises"
DESCRIPTION = "This package includes the documentation for texlive-exercises"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn55188"

RPM_NAME = "texlive-exercises-doc-2023.201.1.1svn55188-52.1.noarch.rpm"
RPM_HASH = "d9fe7699b5c52a8befebc9ae7d4625cacfc912e74129e5a1d3e6482756d462f2529ce6f01ca059c05aa2b2742f60edc8e05869841da27304719cb633d4d2e338"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-exercises-doc"
RDEPENDS:${PN} += ""

inherit rpm
