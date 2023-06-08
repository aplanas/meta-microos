SUMMARY = "Documentation for texlive-examdesign"
DESCRIPTION = "This package includes the documentation for texlive-examdesign"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.101svn15878"

RPM_NAME = "texlive-examdesign-doc-2023.201.1.101svn15878-52.1.noarch.rpm"
RPM_HASH = "20d2049022c5b1946019fba355366fac40e1cefaabd7b301fd57ff4c594db49bb6e55176f2c81c37978a50ea11ef2be003d55d2d30bdc80ff3b7fc03b293c19e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-examdesign-doc"
RDEPENDS:${PN} += ""

inherit rpm
