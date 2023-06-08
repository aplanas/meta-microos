SUMMARY = "Documentation for texlive-physics2"
DESCRIPTION = "This package includes the documentation for texlive-physics2"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1.1svn66115"

RPM_NAME = "texlive-physics2-doc-2023.201.0.0.1.1svn66115-51.1.noarch.rpm"
RPM_HASH = "ade9ba28a120ccbb89de1c4c135d09d463a05510c55f611265d144eba12f356967cec97d9387efe41d0a85fcb0991267ac6cecaa242ce9cfdce2a44316da2371"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-physics2-doc"
RDEPENDS:${PN} += ""

inherit rpm
