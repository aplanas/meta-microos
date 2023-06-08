SUMMARY = "Documentation for texlive-psizzl"
DESCRIPTION = "This package includes the documentation for texlive-psizzl"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.35svn15878"

RPM_NAME = "texlive-psizzl-doc-2023.201.0.0.35svn15878-52.1.noarch.rpm"
RPM_HASH = "ea3b179aa1873d9aaef03b634c6b9241a03704690062c7447b44cf317e8784aef49e3064ae63c44964360b9619ac475593a701205d3c7807bd1b8d681edcca98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-psizzl-doc"
RDEPENDS:${PN} += ""

inherit rpm
