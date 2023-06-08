SUMMARY = "Documentation for texlive-babel"
DESCRIPTION = "This package includes the documentation for texlive-babel"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.86svn65823"

RPM_NAME = "texlive-babel-doc-2023.201.3.86svn65823-53.1.noarch.rpm"
RPM_HASH = "92ca16bff1978c241651572c50c3862304b495f5e8dce1d847c96528a5cd58d3f7076ede4238f1ea652a42698ed7f05961e9049177c14b26193a6ebfe74ba881"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-doc"
RDEPENDS:${PN} += ""

inherit rpm
