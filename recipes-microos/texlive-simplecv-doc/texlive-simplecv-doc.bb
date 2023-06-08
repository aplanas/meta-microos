SUMMARY = "Documentation for texlive-simplecv"
DESCRIPTION = "This package includes the documentation for texlive-simplecv"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.6asvn35537"

RPM_NAME = "texlive-simplecv-doc-2023.201.1.6asvn35537-53.1.noarch.rpm"
RPM_HASH = "0ac61aff3e91b560393e416dbd077a9cae4955b8c5040feda961970b159bde9638a48c838b688dbc41b964871fca3fe7e042f553ba3780c1dbe517056310412b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-simplecv-doc"
RDEPENDS:${PN} += ""

inherit rpm
