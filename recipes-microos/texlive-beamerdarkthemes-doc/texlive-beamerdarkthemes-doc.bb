SUMMARY = "Documentation for texlive-beamerdarkthemes"
DESCRIPTION = "This package includes the documentation for texlive-beamerdarkthemes"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5.1svn55117"

RPM_NAME = "texlive-beamerdarkthemes-doc-2023.201.0.0.5.1svn55117-53.1.noarch.rpm"
RPM_HASH = "9ba108658844b13c9b4b515b23671382dd4b0b7060d50c789ffdf125e734f6a5258a9805491b169e8cfa73d88e5a6c96aa4062008fcd141b761337be52610727"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamerdarkthemes-doc"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
