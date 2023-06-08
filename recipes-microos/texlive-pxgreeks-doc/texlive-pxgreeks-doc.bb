SUMMARY = "Documentation for texlive-pxgreeks"
DESCRIPTION = "This package includes the documentation for texlive-pxgreeks"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn21838"

RPM_NAME = "texlive-pxgreeks-doc-2023.201.1.0svn21838-53.1.noarch.rpm"
RPM_HASH = "2e8d69a1e85aa51c168c1b67bc3401dc442e11a47a408d048c0d99d10006fad3b081c7ff3e881ab2d947938a3ce4f1e2992ccd52ee65a1701e469f9ced5079d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pxgreeks-doc"
RDEPENDS:${PN} += ""

inherit rpm
