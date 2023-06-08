SUMMARY = "Documentation for texlive-fenixpar"
DESCRIPTION = "This package includes the documentation for texlive-fenixpar"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.92svn24730"

RPM_NAME = "texlive-fenixpar-doc-2023.201.0.0.92svn24730-52.1.noarch.rpm"
RPM_HASH = "e786ac8e023ab68680bcc2a99a889e686c9e26d9d84e3f0acc58bf8939df3c2dfcc9796129cc4b5b6d8a73284fd50f3e2e84281dcd471d3d33131426edddc831"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fenixpar-doc"
RDEPENDS:${PN} += ""

inherit rpm
