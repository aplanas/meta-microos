SUMMARY = "Documentation for texlive-mathabx-type1"
DESCRIPTION = "This package includes the documentation for texlive-mathabx-type1"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn21129"

RPM_NAME = "texlive-mathabx-type1-doc-2023.201.svn21129-52.1.noarch.rpm"
RPM_HASH = "5b6e222d7d17791169eaa7455984953f8ec42deaf776bcc06532e39654c1d8c739e5107e6d29956e60a8aa8588151c29d878d5bfbdc30e0c129eb5255ea08239"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mathabx-type1-doc"
RDEPENDS:${PN} += ""

inherit rpm
