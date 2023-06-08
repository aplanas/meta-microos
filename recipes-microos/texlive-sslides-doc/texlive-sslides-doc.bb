SUMMARY = "Documentation for texlive-sslides"
DESCRIPTION = "This package includes the documentation for texlive-sslides"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn32293"

RPM_NAME = "texlive-sslides-doc-2023.201.svn32293-57.1.noarch.rpm"
RPM_HASH = "f06174022afe1db7a80cf74d1b200a573a2bcb380533e09e2b4416c2b0bfeee71564d1a571a6364ab887e2ee19346ede1802d78d02af9bbb91d50feac30b95af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sslides-doc"
RDEPENDS:${PN} += ""

inherit rpm
