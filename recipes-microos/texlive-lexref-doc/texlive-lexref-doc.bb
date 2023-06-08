SUMMARY = "Documentation for texlive-lexref"
DESCRIPTION = "This package includes the documentation for texlive-lexref"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1asvn36026"

RPM_NAME = "texlive-lexref-doc-2023.201.1.1asvn36026-54.1.noarch.rpm"
RPM_HASH = "61d406ff91eaaf9017b92a121b358f5a8d426950bf07e93fd9a15a9a0818e615938c28c10ede3281584834ead8f117810dc693012064db143c35097c50109335"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lexref-doc"
RDEPENDS:${PN} += ""

inherit rpm
