SUMMARY = "Documentation for texlive-proflycee"
DESCRIPTION = "This package includes the documentation for texlive-proflycee"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.5.4svn66581"

RPM_NAME = "texlive-proflycee-doc-2023.201.2.5.4svn66581-52.1.noarch.rpm"
RPM_HASH = "59fad95352f00d9c73241eea4127d2f241135d9e8ed448b38f046f02adc15414aa957c132843d5207be29147e641976b4c133c9d233816c0ec0b47d9dcbb02f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-proflycee-doc:fr) texlive-proflycee-doc"
RDEPENDS:${PN} += ""

inherit rpm
