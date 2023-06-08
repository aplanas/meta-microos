SUMMARY = "Documentation for texlive-hexgame"
DESCRIPTION = "This package includes the documentation for texlive-hexgame"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-hexgame-doc-2023.201.1.0svn15878-53.1.noarch.rpm"
RPM_HASH = "3e71157cca31f5642948c64faed4d386ad8efe44df0fb2ed334cca3b5d1f607213b058aa36e666be5d01e0e5e025541183e9f7c59a0721cd18f433bef8fc3003"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hexgame-doc"
RDEPENDS:${PN} += ""

inherit rpm
