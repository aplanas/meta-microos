SUMMARY = "Documentation for texlive-electrum"
DESCRIPTION = "This package includes the documentation for texlive-electrum"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.005_bsvn19705"

RPM_NAME = "texlive-electrum-doc-2023.201.1.005_bsvn19705-53.1.noarch.rpm"
RPM_HASH = "4a783635563c90d92010188b8446d2ccea08a0e003793a7c74f070866fb28217b29224fefb35ffdc39a15d8651e03abbf4cee380d63a4269beef4da95d63ef00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-electrum-doc"
RDEPENDS:${PN} += ""

inherit rpm
