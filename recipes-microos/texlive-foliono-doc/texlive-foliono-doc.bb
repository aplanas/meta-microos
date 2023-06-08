SUMMARY = "Documentation for texlive-foliono"
DESCRIPTION = "This package includes the documentation for texlive-foliono"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.000svn58877"

RPM_NAME = "texlive-foliono-doc-2023.201.1.000svn58877-52.1.noarch.rpm"
RPM_HASH = "547d71f44b32a29d999726f10f14779f67a50ff9953cd871721a00fbd5fdd506a32413f5fa0cb93cd3a9773a34ead1ab57a397167b62035f1952e6d9163745fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-foliono-doc"
RDEPENDS:${PN} += ""

inherit rpm
