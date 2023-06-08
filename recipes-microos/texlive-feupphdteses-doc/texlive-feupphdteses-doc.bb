SUMMARY = "Documentation for texlive-feupphdteses"
DESCRIPTION = "This package includes the documentation for texlive-feupphdteses"
LICENSE = "LPPL-1.0"

PV = "2023.201.4.0svn30962"

RPM_NAME = "texlive-feupphdteses-doc-2023.201.4.0svn30962-52.1.noarch.rpm"
RPM_HASH = "26d32b4a73deeb53f641d7247044821fbc456ec5d648d449677cfd083d0ed800a32368a5d6cec32e5509d3042910ac10cd6683c2585323b879c1321467599da1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-feupphdteses-doc"
RDEPENDS:${PN} += ""

inherit rpm
