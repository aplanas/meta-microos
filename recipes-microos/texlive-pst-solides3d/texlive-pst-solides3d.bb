SUMMARY = "Draw perspective views of 3D solids"
DESCRIPTION = "The package is designed to draw solids in 3d perspective. \
Features include: create primitive solids; create solids by \
including a list of its vertices and faces; faces of solids and \
surfaces can be colored by choosing from a very large palette \
of colors; draw parametric surfaces in algebraic and reverse \
polish notation; create explicit and parameterized algebraic \
functions drawn in 2 or 3 dimensions; project text onto a plane \
or onto the faces of a solid; support for including external \
database files."
LICENSE = "LPPL-1.0"

PV = "2023.201.4.34asvn61719"

RPM_NAME = "texlive-pst-solides3d-2023.201.4.34asvn61719-53.1.noarch.rpm"
RPM_HASH = "33b9ddb658c85eb6dd41c0da66d3d00078543c36d1399c7769fb3697bbb9723c913425fbc9dda5950b043a884829419f06151ee8cc5b9d322c351a5a0fe4dd55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pst-solides3d.sty) tex(pst-solides3d.tex) texlive-pst-solides3d"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(pstricks.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
