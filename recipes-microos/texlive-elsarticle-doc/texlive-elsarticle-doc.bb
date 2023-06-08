SUMMARY = "Documentation for texlive-elsarticle"
DESCRIPTION = "This package includes the documentation for texlive-elsarticle"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.3svn56999"

RPM_NAME = "texlive-elsarticle-doc-2023.201.3.3svn56999-53.1.noarch.rpm"
RPM_HASH = "70df305985b68037c59c9655d66797181135e780b1d4bd8eaba196dbaeb8f03e27eac576eebdf39df78da0f4aa0f8742b4803c9358bc3fa5bcb1ffa1ebd05570"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-elsarticle-doc"
RDEPENDS:${PN} += ""

inherit rpm
