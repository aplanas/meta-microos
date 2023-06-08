SUMMARY = "Documentation for texlive-complexity"
DESCRIPTION = "This package includes the documentation for texlive-complexity"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.81asvn45322"

RPM_NAME = "texlive-complexity-doc-2023.201.0.0.81asvn45322-53.1.noarch.rpm"
RPM_HASH = "a7a8ca365e84c3f8c6942a5b71e2a901bdf41f56fe7df241898b81315045466c28a2fa278b28155a9a552595cb38a4c7b1ae4c6dac0e585b755ec1d58277b878"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-complexity-doc"
RDEPENDS:${PN} += ""

inherit rpm
