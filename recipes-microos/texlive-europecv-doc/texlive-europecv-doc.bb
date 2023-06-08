SUMMARY = "Documentation for texlive-europecv"
DESCRIPTION = "This package includes the documentation for texlive-europecv"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn64037"

RPM_NAME = "texlive-europecv-doc-2023.201.svn64037-52.1.noarch.rpm"
RPM_HASH = "7d1952283db7057ddb93f544b98d62b69c304953f0f756e61273de86f46b3a8640693cb15a186da788cd69b5ec2eefc98fc6a6a93dae5c061adfcdb0e84c737e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-europecv-doc"
RDEPENDS:${PN} += ""

inherit rpm
