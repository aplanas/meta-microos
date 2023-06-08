SUMMARY = "Documentation for texlive-textfit"
DESCRIPTION = "This package includes the documentation for texlive-textfit"
LICENSE = "LPPL-1.0"

PV = "2023.201.5svn20591"

RPM_NAME = "texlive-textfit-doc-2023.201.5svn20591-54.1.noarch.rpm"
RPM_HASH = "02d9e9228098d13aa27dcbf1f2878d04c3a02e2f525c3df4b4b1eef7bc25bdc9bf4943ebb8d4a07162305d929cb2d5cf671bfcc5d5d245e626f97c32cc7e6f64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-textfit-doc"
RDEPENDS:${PN} += ""

inherit rpm
