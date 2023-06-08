SUMMARY = "Documentation for texlive-bxeepic"
DESCRIPTION = "This package includes the documentation for texlive-bxeepic"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn30559"

RPM_NAME = "texlive-bxeepic-doc-2023.201.0.0.2svn30559-52.1.noarch.rpm"
RPM_HASH = "31292cf5263ff5d5924d75efdfd482b695ed5586b6927ecf88e74b666f33f63cd1ef3cd37e465635e91b7c45734824a9fa4d1b2f6caded68b22f40911ec1cc16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bxeepic-doc"
RDEPENDS:${PN} += ""

inherit rpm
