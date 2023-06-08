SUMMARY = "Documentation for texlive-beameraudience"
DESCRIPTION = "This package includes the documentation for texlive-beameraudience"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn23427"

RPM_NAME = "texlive-beameraudience-doc-2023.201.0.0.1svn23427-53.1.noarch.rpm"
RPM_HASH = "4011c943c288d15ae030152aeed5974b39d2499cd1e57e633b1620ef27f5ac9302a2cb5d80994d1b60deab4e5b65adf7f9662efd55dd7c938749c4584a195ba0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beameraudience-doc"
RDEPENDS:${PN} += ""

inherit rpm
