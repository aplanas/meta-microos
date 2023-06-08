SUMMARY = "Documentation for texlive-statmath"
DESCRIPTION = "This package includes the documentation for texlive-statmath"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn46925"

RPM_NAME = "texlive-statmath-doc-2023.201.0.0.1svn46925-57.1.noarch.rpm"
RPM_HASH = "557747f4492a87e7dd398bd24b29ecc3d0b6f77e3e6c94022563a095f49d2dbd1393f0c43609e1aa917dcf8aaf45a9f7cfda256fcc4ef5118b9b59f891d4d3b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-statmath-doc"
RDEPENDS:${PN} += ""

inherit rpm
