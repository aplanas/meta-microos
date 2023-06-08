SUMMARY = "Documentation for texlive-baekmuk"
DESCRIPTION = "This package includes the documentation for texlive-baekmuk"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.2.1svn56915"

RPM_NAME = "texlive-baekmuk-doc-2023.201.2.2.1svn56915-53.1.noarch.rpm"
RPM_HASH = "4ed290fb81752df5ab7e04c4ffb2cfb54e033a6215da3b85cf79a8d012d55484bf23dd9fd67fa46cd91c4536089d9870602ad033870559b934a0892b9ef6a9f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-baekmuk-doc"
RDEPENDS:${PN} += ""

inherit rpm
