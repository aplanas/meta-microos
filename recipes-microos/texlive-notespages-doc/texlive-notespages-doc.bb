SUMMARY = "Documentation for texlive-notespages"
DESCRIPTION = "This package includes the documentation for texlive-notespages"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.8.1svn41906"

RPM_NAME = "texlive-notespages-doc-2023.201.0.0.8.1svn41906-54.1.noarch.rpm"
RPM_HASH = "8a964415c6c05dbc06d20683f9b68f7d9c93862eb3ee2189aeedd51728421e4efe31fcc92fc8ebd2b9e1f22ed6a26a3c7384e66f0758852846576e83255569b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-notespages-doc"
RDEPENDS:${PN} += ""

inherit rpm
