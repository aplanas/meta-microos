SUMMARY = "Documentation for texlive-bookcover"
DESCRIPTION = "This package includes the documentation for texlive-bookcover"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.5svn65394"

RPM_NAME = "texlive-bookcover-doc-2023.201.3.5svn65394-52.1.noarch.rpm"
RPM_HASH = "8241e38b006e7870f85be0919b5bac63149d8c428c5fa8a7bae5527cd954a53693ecc27b1c0a0082f92b29731a44406b6c9629c37b43a3b0633962df6c8e5616"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bookcover-doc"
RDEPENDS:${PN} += ""

inherit rpm
