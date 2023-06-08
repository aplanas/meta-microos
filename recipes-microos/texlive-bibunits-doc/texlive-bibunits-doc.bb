SUMMARY = "Documentation for texlive-bibunits"
DESCRIPTION = "This package includes the documentation for texlive-bibunits"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.2svn15878"

RPM_NAME = "texlive-bibunits-doc-2023.201.2.2svn15878-53.1.noarch.rpm"
RPM_HASH = "b0cca66bb58ad5baf7709205a4f82b17ac4c046347563210a1238d6e7c898729e283ea224d625338306a032fa2784a0b34bec3ef7de3d9279275f0a1409f7c83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bibunits-doc"
RDEPENDS:${PN} += ""

inherit rpm
