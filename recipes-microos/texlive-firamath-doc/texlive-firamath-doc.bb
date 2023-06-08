SUMMARY = "Documentation for texlive-firamath"
DESCRIPTION = "This package includes the documentation for texlive-firamath"
LICENSE = "OFL-1.1"

PV = "2023.201.0.0.3.4svn56672"

RPM_NAME = "texlive-firamath-doc-2023.201.0.0.3.4svn56672-52.1.noarch.rpm"
RPM_HASH = "bed57324ead82e89b1aeba1a1f7f5b83e9179650c9159234c4847fde43db4e833bd3be4da1248619c882649dd2dd3b4d927d2009198003bd2214d6e3af281ee5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-firamath-doc"
RDEPENDS:${PN} += ""

inherit rpm
