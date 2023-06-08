SUMMARY = "Documentation for texlive-ebezier"
DESCRIPTION = "This package includes the documentation for texlive-ebezier"
LICENSE = "LPPL-1.0"

PV = "2023.201.4svn15878"

RPM_NAME = "texlive-ebezier-doc-2023.201.4svn15878-53.1.noarch.rpm"
RPM_HASH = "66e1c68be10e543d9adc3587c85dc99d0dd55e6ea60e8cd8b47ada0d3b6efb1d82694296c9fc89ecb5dea2df2c260a5e3f00c567d9bd818974addb89e967167d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ebezier-doc"
RDEPENDS:${PN} += ""

inherit rpm
