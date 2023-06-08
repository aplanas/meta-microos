SUMMARY = "Documentation for texlive-ifptex"
DESCRIPTION = "This package includes the documentation for texlive-ifptex"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.2svn62982"

RPM_NAME = "texlive-ifptex-doc-2023.201.2.2svn62982-52.1.noarch.rpm"
RPM_HASH = "18dae3a268a70b9bc656e260601735782c411e4832765189338757ac0685fdf71af665dcc839e8d6e1b3fa90b48e003d5ed37178081deee322f1c0c6f7429988"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-ifptex-doc:ja) texlive-ifptex-doc"
RDEPENDS:${PN} += ""

inherit rpm
