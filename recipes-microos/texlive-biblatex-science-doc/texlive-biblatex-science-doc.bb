SUMMARY = "Documentation for texlive-biblatex-science"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-science"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn48945"

RPM_NAME = "texlive-biblatex-science-doc-2023.201.1.2svn48945-53.1.noarch.rpm"
RPM_HASH = "e07abada6dd8f91195d50d5f8f131679374f076c3d588353ae1bfacb3bd15c93e358a1f2314d1d3fbd09b1e60f72923c9e45be807b6579616582d001895e213a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-science-doc"
RDEPENDS:${PN} += ""

inherit rpm
