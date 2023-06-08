SUMMARY = "Documentation for texlive-xfor"
DESCRIPTION = "This package includes the documentation for texlive-xfor"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.05svn15878"

RPM_NAME = "texlive-xfor-doc-2023.201.1.05svn15878-52.1.noarch.rpm"
RPM_HASH = "d878721ca2e32332b19452d234c17d0c1fed8bc8e35a8f8f200a3722832dd63ff03af8b80618c1e2a49a9bb390531dd364e0e495ae9da4288f4a9dd2f22d5f91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xfor-doc"
RDEPENDS:${PN} += ""

inherit rpm
