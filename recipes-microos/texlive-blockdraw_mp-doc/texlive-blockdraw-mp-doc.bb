SUMMARY = "Documentation for texlive-blockdraw_mp"
DESCRIPTION = "This package includes the documentation for texlive-blockdraw_mp"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-blockdraw_mp-doc-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "9b292efdc0bccd179922d265be28839e0147fbdd1c28b793191b8d46b15f5e9e25e5a566856824e14e24148aef330afc127583f77f52b45323a9f48266952996"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-blockdraw_mp-doc"
RDEPENDS:${PN} += ""

inherit rpm
