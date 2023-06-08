SUMMARY = "Documentation for texlive-babel-irish"
DESCRIPTION = "This package includes the documentation for texlive-babel-irish"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0hsvn30277"

RPM_NAME = "texlive-babel-irish-doc-2023.201.1.0hsvn30277-53.1.noarch.rpm"
RPM_HASH = "5ca7f774774c084902a44db369eecf4b8cd3bda3a80affd42d59e91188f9c9d33fac1c263a1d0c9546563c0065794dfde2e675ceff1abec3f1e08770c1805197"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-irish-doc"
RDEPENDS:${PN} += ""

inherit rpm
