SUMMARY = "Documentation for texlive-stellenbosch"
DESCRIPTION = "This package includes the documentation for texlive-stellenbosch"
LICENSE = "LPPL-1.0"

PV = "2023.201.11asvn66379"

RPM_NAME = "texlive-stellenbosch-doc-2023.201.11asvn66379-57.1.noarch.rpm"
RPM_HASH = "4b01df39018cfa46a91fea4b31f09542384c55bc8e54b78e6fd2c8fe81a6788c731fa04f7916ab12cef8d83173bf601756777ffc54fcf162e78856970a0b83d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-stellenbosch-doc:en) texlive-stellenbosch-doc"
RDEPENDS:${PN} += ""

inherit rpm
