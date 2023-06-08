SUMMARY = "Documentation for texlive-pagella-otf"
DESCRIPTION = "This package includes the documentation for texlive-pagella-otf"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.02svn64705"

RPM_NAME = "texlive-pagella-otf-doc-2023.201.0.0.02svn64705-51.1.noarch.rpm"
RPM_HASH = "b1e77ff854c357a2ef874d3506597faa2b451a5296728c645207239170beac25a76e630428fcbceec9c77689bf77d9c1211304bc67de8b04da47516b5f2a8c8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pagella-otf-doc"
RDEPENDS:${PN} += ""

inherit rpm
