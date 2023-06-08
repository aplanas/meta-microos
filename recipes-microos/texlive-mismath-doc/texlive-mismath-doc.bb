SUMMARY = "Documentation for texlive-mismath"
DESCRIPTION = "This package includes the documentation for texlive-mismath"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.7svn66391"

RPM_NAME = "texlive-mismath-doc-2023.201.2.7svn66391-54.1.noarch.rpm"
RPM_HASH = "9dd320b40e993990f4a272e7ec57d522d9185e884e6b9917161b6028f475344c35e21e81f67b4f0ab7032c0d74612f8850bc0e0f2ea7b4238c39f7125127b260"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mismath-doc"
RDEPENDS:${PN} += ""

inherit rpm
