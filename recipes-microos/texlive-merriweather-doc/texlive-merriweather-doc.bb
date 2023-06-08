SUMMARY = "Documentation for texlive-merriweather"
DESCRIPTION = "This package includes the documentation for texlive-merriweather"
LICENSE = "OFL-1.1"

PV = "2023.201.svn64452"

RPM_NAME = "texlive-merriweather-doc-2023.201.svn64452-54.1.noarch.rpm"
RPM_HASH = "c72f9129ac0d436a32068e0c9f5f994a62ee69e4e53f0c1d1e37230e04884fc82aa90e710d17c9d0db72f21b912607abacb594a0c3d2e6bf6b48e44ab6c74d61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-merriweather-doc"
RDEPENDS:${PN} += ""

inherit rpm
