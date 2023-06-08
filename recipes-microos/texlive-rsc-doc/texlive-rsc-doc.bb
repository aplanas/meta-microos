SUMMARY = "Documentation for texlive-rsc"
DESCRIPTION = "This package includes the documentation for texlive-rsc"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.1fsvn41923"

RPM_NAME = "texlive-rsc-doc-2023.201.3.1fsvn41923-53.1.noarch.rpm"
RPM_HASH = "2628cf3eb0ac0e4c5b08fdcbf56515913c14c5b71b2d501c2d27b257fd91fd4893f2d622712f289e867ae5de5e0bbee99a11cf624001834973975662f8d5e8ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rsc-doc"
RDEPENDS:${PN} += ""

inherit rpm
