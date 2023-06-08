SUMMARY = "Documentation for texlive-tikz-truchet"
DESCRIPTION = "This package includes the documentation for texlive-tikz-truchet"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn50020"

RPM_NAME = "texlive-tikz-truchet-doc-2023.201.svn50020-52.1.noarch.rpm"
RPM_HASH = "1a17c1ad6da9cc9e5837937d93f8fcb74619cfb0340c12d60287a8b67e490f764752252017485990dd5062850a92f1786e19da789584636729053d4f550377df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-truchet-doc"
RDEPENDS:${PN} += ""

inherit rpm
