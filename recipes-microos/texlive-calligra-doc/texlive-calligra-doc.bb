SUMMARY = "Documentation for texlive-calligra"
DESCRIPTION = "This package includes the documentation for texlive-calligra"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-calligra-doc-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "7cf56d3ae8d5b804abdd2cc17ea873039456499588ce8b9d4fa50ad30cd529d4056489e6d0ced7f2a4bf54e75ee1223484a235201719bde6a1e0258ea064d5f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-calligra-doc"
RDEPENDS:${PN} += ""

inherit rpm
