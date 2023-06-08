SUMMARY = "Documentation for texlive-glossaries-english"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-english"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn35665"

RPM_NAME = "texlive-glossaries-english-doc-2023.201.1.0svn35665-53.1.noarch.rpm"
RPM_HASH = "94157b2ee22f78bdff3f5144b674ab84e5c86686e8beba7654ea7049cb4b4e22ded2c04fcaee795420a1c15cf99ff167a56510d50db2a73acaadaa2fea96464e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-english-doc"
RDEPENDS:${PN} += ""

inherit rpm
