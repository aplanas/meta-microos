SUMMARY = "Documentation for texlive-xcolor-material"
DESCRIPTION = "This package includes the documentation for texlive-xcolor-material"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn42289"

RPM_NAME = "texlive-xcolor-material-doc-2023.201.0.0.1svn42289-52.1.noarch.rpm"
RPM_HASH = "e226621dc5d6468589e864111843560cdc97be2d2c892ba617683e365051e9b4825b367240baf475c6e0af8640d3effaa41ba4207371015565423c605d0073ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xcolor-material-doc"
RDEPENDS:${PN} += ""

inherit rpm
