SUMMARY = "Documentation for texlive-datetime2-greek"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-greek"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn47533"

RPM_NAME = "texlive-datetime2-greek-doc-2023.201.1.1svn47533-52.1.noarch.rpm"
RPM_HASH = "fdae4dc05332d228fc54be3c02ac39bb86330ccc2df173a68581e6c53cd967e9695ddea18f332f42fb4f1b7c5a09a7ae6ba8a584e85bb1482c42d8aa33a084f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-greek-doc"
RDEPENDS:${PN} += ""

inherit rpm
