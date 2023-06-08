SUMMARY = "Documentation for texlive-rubik"
DESCRIPTION = "This package includes the documentation for texlive-rubik"
LICENSE = "LPPL-1.0"

PV = "2023.201.5.0svn46791"

RPM_NAME = "texlive-rubik-doc-2023.201.5.0svn46791-53.1.noarch.rpm"
RPM_HASH = "05459bf236d226a4e072d83e7409fbc0a0e327645da9c003e1a7ecc564599cd3bc3a4b36b046229f0b80feda58a2f36f1ec03f90627f8267c3f854b3f5309268"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(rubikrotation.1) texlive-rubik-doc"
RDEPENDS:${PN} += ""

inherit rpm
