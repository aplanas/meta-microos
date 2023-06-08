SUMMARY = "Documentation for texlive-hu-berlin-bundle"
DESCRIPTION = "This package includes the documentation for texlive-hu-berlin-bundle"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1.1svn57580"

RPM_NAME = "texlive-hu-berlin-bundle-doc-2023.201.1.1.1svn57580-52.1.noarch.rpm"
RPM_HASH = "93b2bd6e4f3328656468a88bfef57e6e5307d9ce4d7d0a888395a140630e043f34072a85a2c884282a501381c9fa4fcdb57ee7ca3206da40cf59ea991a45fa06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hu-berlin-bundle-doc"
RDEPENDS:${PN} += ""

inherit rpm
