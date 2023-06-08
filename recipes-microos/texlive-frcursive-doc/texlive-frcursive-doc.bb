SUMMARY = "Documentation for texlive-frcursive"
DESCRIPTION = "This package includes the documentation for texlive-frcursive"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn24559"

RPM_NAME = "texlive-frcursive-doc-2023.201.svn24559-52.1.noarch.rpm"
RPM_HASH = "2a5eb61e57ba6ff9f151669948ede9506f7046a081bad6e4bd4b444e3c7e872ca038fc2e50db1711a59ea30fb56d209a51331ad5d912067f9fe434ba66b7b2ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-frcursive-doc"
RDEPENDS:${PN} += ""

inherit rpm
