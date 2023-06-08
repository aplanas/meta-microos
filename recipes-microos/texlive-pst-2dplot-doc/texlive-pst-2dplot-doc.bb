SUMMARY = "Documentation for texlive-pst-2dplot"
DESCRIPTION = "This package includes the documentation for texlive-pst-2dplot"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn15878"

RPM_NAME = "texlive-pst-2dplot-doc-2023.201.1.5svn15878-52.1.noarch.rpm"
RPM_HASH = "8435fdc835c1e1264efc1bbf0aa004aa5d817af4434d2c8728169f1af115a503711938cc0cf9e24b1a66e394ce565229a69cb55e7432fccf3e2d1ee500b0ff55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-2dplot-doc"
RDEPENDS:${PN} += ""

inherit rpm
