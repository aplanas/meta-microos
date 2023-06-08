SUMMARY = "Documentation for texlive-exframe"
DESCRIPTION = "This package includes the documentation for texlive-exframe"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.4svn53911"

RPM_NAME = "texlive-exframe-doc-2023.201.3.4svn53911-52.1.noarch.rpm"
RPM_HASH = "047d8200f6542d729db100242d180a960d6e06c6f4980f40eda0e51720efde9036308b701142564cbd4e5f737f2b5c4ce9eb42d69deb3c09621983fa248bafa1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-exframe-doc"
RDEPENDS:${PN} += ""

inherit rpm
