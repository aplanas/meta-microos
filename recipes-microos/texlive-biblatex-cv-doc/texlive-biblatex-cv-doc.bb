SUMMARY = "Documentation for texlive-biblatex-cv"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-cv"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.01svn59433"

RPM_NAME = "texlive-biblatex-cv-doc-2023.201.0.0.01svn59433-53.1.noarch.rpm"
RPM_HASH = "befc8fa1bd16e786c13738f5c325b6720a354f43b1f7fc2bb5c28730b8c1114b6685525719b61a389746d85d0f23a0c1be650720526a47708d65e9fdfecf537d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-cv-doc"
RDEPENDS:${PN} += ""

inherit rpm
