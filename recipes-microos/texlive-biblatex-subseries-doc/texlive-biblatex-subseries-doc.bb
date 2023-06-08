SUMMARY = "Documentation for texlive-biblatex-subseries"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-subseries"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2.0svn43330"

RPM_NAME = "texlive-biblatex-subseries-doc-2023.201.1.2.0svn43330-53.1.noarch.rpm"
RPM_HASH = "8badb554f49579b3ce311d909b9344324c764a2acc02414e04ed6d4271b539e71a8647b453c16dcde2754534047cc9bec741363d3e23ee5de0128a912eddb325"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-subseries-doc"
RDEPENDS:${PN} += ""

inherit rpm
