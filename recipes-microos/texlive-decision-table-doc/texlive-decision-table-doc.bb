SUMMARY = "Documentation for texlive-decision-table"
DESCRIPTION = "This package includes the documentation for texlive-decision-table"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.0.4svn60673"

RPM_NAME = "texlive-decision-table-doc-2023.201.0.0.0.4svn60673-52.1.noarch.rpm"
RPM_HASH = "0a463cce29240348921fa2fffebaed6a1305e515f8dc5da566c6b11d991bcf19457dfbb37b93c63b24674861b38258392c94829c74bd9406ce8ddfc4ac93290a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-decision-table-doc"
RDEPENDS:${PN} += ""

inherit rpm
