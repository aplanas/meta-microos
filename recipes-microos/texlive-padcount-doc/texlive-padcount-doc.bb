SUMMARY = "Documentation for texlive-padcount"
DESCRIPTION = "This package includes the documentation for texlive-padcount"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn47621"

RPM_NAME = "texlive-padcount-doc-2023.201.1.0svn47621-51.1.noarch.rpm"
RPM_HASH = "7b66f9e1edecf51953721b38dbe4f3ccaa99db15e86cdafa80014a410d24e6a26e93670f0d2ed5d1d7a69e698dac52afabe457b2c7a6116830dbcbb2d8496d0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-padcount-doc"
RDEPENDS:${PN} += ""

inherit rpm
