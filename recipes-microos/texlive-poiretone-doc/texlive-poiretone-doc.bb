SUMMARY = "Documentation for texlive-poiretone"
DESCRIPTION = "This package includes the documentation for texlive-poiretone"
LICENSE = "OFL-1.1"

PV = "2023.201.svn64856"

RPM_NAME = "texlive-poiretone-doc-2023.201.svn64856-52.1.noarch.rpm"
RPM_HASH = "4394bdd1329b94672cf55de3201b790ed7829cd113b2c987a85ccfffc8b343020b5019453ea389fcae47af9bbba6ade80633b6ea856fe274dbc061d749318864"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-poiretone-doc"
RDEPENDS:${PN} += ""

inherit rpm
