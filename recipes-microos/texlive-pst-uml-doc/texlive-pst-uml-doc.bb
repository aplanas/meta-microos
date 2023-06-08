SUMMARY = "Documentation for texlive-pst-uml"
DESCRIPTION = "This package includes the documentation for texlive-pst-uml"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.83svn15878"

RPM_NAME = "texlive-pst-uml-doc-2023.201.0.0.83svn15878-53.1.noarch.rpm"
RPM_HASH = "909291cb63d5a578d8e889fa6872a7c5dcc97b1f51a8de61a0014427246fc05416ed2e53e3312e56047c6f77e44353a19dcea0ec247108350e91437a84629a33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-pst-uml-doc:fr) texlive-pst-uml-doc"
RDEPENDS:${PN} += ""

inherit rpm
