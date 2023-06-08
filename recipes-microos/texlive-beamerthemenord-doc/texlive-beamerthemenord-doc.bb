SUMMARY = "Documentation for texlive-beamerthemenord"
DESCRIPTION = "This package includes the documentation for texlive-beamerthemenord"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2.0svn56180"

RPM_NAME = "texlive-beamerthemenord-doc-2023.201.0.0.2.0svn56180-53.1.noarch.rpm"
RPM_HASH = "2122b2c90ed7a6e67053d9ccb9aa3062299132669f00abcdb8e7d901df4988879573aa4b225db1a3a97bb27eea4171f09040248214b125cece0b108f0bc553ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamerthemenord-doc"
RDEPENDS:${PN} += ""

inherit rpm
