SUMMARY = "Documentation for texlive-lualinalg"
DESCRIPTION = "This package includes the documentation for texlive-lualinalg"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn65834"

RPM_NAME = "texlive-lualinalg-doc-2023.201.1.2svn65834-52.1.noarch.rpm"
RPM_HASH = "4421309d3dda1a227fc4af3b53acf6eeb8858c02fc611dc91da062e15c22a920a723609800d21502637ded1c2a46d5165408a4650f1a912ae3a360a158fecb49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lualinalg-doc"
RDEPENDS:${PN} += ""

inherit rpm
