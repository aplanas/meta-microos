SUMMARY = "Documentation for texlive-threeparttable"
DESCRIPTION = "This package includes the documentation for texlive-threeparttable"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn17383"

RPM_NAME = "texlive-threeparttable-doc-2023.201.svn17383-54.1.noarch.rpm"
RPM_HASH = "f641898bb62de5f353b131701449a37177056b6b11d770dca436e2375c1c0afa1456982cf5439342bac7d2ca5098ed76f816863dbc13de585e334998db9b51ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-threeparttable-doc"
RDEPENDS:${PN} += ""

inherit rpm
