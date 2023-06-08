SUMMARY = "Documentation for texlive-phffullpagefigure"
DESCRIPTION = "This package includes the documentation for texlive-phffullpagefigure"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn41857"

RPM_NAME = "texlive-phffullpagefigure-doc-2023.201.1.0svn41857-51.1.noarch.rpm"
RPM_HASH = "5341608676877bd1635efbff48c98f9c454259e107534a261219e812e4977b883ab4d8fd591b5d65becf2c81e8ae7d543b8fc8a1fe90ae4891ac2fe1cb35101c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-phffullpagefigure-doc"
RDEPENDS:${PN} += ""

inherit rpm
