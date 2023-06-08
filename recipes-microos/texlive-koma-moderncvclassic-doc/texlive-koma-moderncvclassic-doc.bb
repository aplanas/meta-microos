SUMMARY = "Documentation for texlive-koma-moderncvclassic"
DESCRIPTION = "This package includes the documentation for texlive-koma-moderncvclassic"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5svn25025"

RPM_NAME = "texlive-koma-moderncvclassic-doc-2023.201.0.0.5svn25025-55.1.noarch.rpm"
RPM_HASH = "0c67fa463c29fff6a2d9cc4b1be1a531cb149bf68635f093005cf5abe60a088666003a1f7a7e0532a267145779d781950339a125a6a8afcbf894fe1de3a2df8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-koma-moderncvclassic-doc"
RDEPENDS:${PN} += ""

inherit rpm
