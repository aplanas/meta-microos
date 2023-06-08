SUMMARY = "Documentation for texlive-medstarbeamer"
DESCRIPTION = "This package includes the documentation for texlive-medstarbeamer"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn38828"

RPM_NAME = "texlive-medstarbeamer-doc-2023.201.svn38828-52.1.noarch.rpm"
RPM_HASH = "c88b410f98eb7825f06a536776204f43cabc19381fb3e2e303e9239e7a4f8447642c3f1733698b1ff7b0d4bf768cb50575338c1b7b55442cfdcca107809d63cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-medstarbeamer-doc"
RDEPENDS:${PN} += ""

inherit rpm
