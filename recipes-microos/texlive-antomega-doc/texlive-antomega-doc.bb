SUMMARY = "Documentation for texlive-antomega"
DESCRIPTION = "This package includes the documentation for texlive-antomega"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.8svn21933"

RPM_NAME = "texlive-antomega-doc-2023.201.0.0.8svn21933-54.1.noarch.rpm"
RPM_HASH = "c59c3e374b1a4ee91004b1deb5834f77e67f332f2badecc345456a06028e91a9fe6d1455432228b2f499534d052a0e06c43c0df376a65ec95fd75ce0241be60e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-antomega-doc"
RDEPENDS:${PN} += ""

inherit rpm
