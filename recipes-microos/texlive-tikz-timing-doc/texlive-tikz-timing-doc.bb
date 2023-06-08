SUMMARY = "Documentation for texlive-tikz-timing"
DESCRIPTION = "This package includes the documentation for texlive-tikz-timing"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.7fsvn64967"

RPM_NAME = "texlive-tikz-timing-doc-2023.201.0.0.7fsvn64967-52.1.noarch.rpm"
RPM_HASH = "ea7aea2ec834f2a37a94cdbdb9dd20c361abe35831cc8f29a2fdd812bd7edb96613f631353b552331d0d34e8613ca93f1fce5d8303903fb064aa52c23529d117"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-timing-doc"
RDEPENDS:${PN} += ""

inherit rpm
