SUMMARY = "Documentation for texlive-mdsymbol"
DESCRIPTION = "This package includes the documentation for texlive-mdsymbol"
LICENSE = "OFL-1.1"

PV = "2023.201.0.0.5svn28399"

RPM_NAME = "texlive-mdsymbol-doc-2023.201.0.0.5svn28399-52.1.noarch.rpm"
RPM_HASH = "12d0fa467feb32feb7ab2f5decedd5e14f974c4d8332788894f11b13c7f5f8fb6f5b683a10091dde3e2d02a158a40cebd18a18082c1554fbd38d07de8a77e70b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mdsymbol-doc"
RDEPENDS:${PN} += ""

inherit rpm
