SUMMARY = "Documentation for texlive-univie-ling"
DESCRIPTION = "This package includes the documentation for texlive-univie-ling"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.3svn65651"

RPM_NAME = "texlive-univie-ling-doc-2023.201.2.3svn65651-53.1.noarch.rpm"
RPM_HASH = "dc41154d9e3610743da964a682cc236ac7d4206d839cd9bc613a9ec6f91a27eac520e6f8a2fcfd3221b40b27c4f2af8891b9b647503d245060fd27addb1c12a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-univie-ling-doc"
RDEPENDS:${PN} += ""

inherit rpm
