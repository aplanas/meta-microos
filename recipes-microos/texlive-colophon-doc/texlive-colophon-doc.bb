SUMMARY = "Documentation for texlive-colophon"
DESCRIPTION = "This package includes the documentation for texlive-colophon"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn47913"

RPM_NAME = "texlive-colophon-doc-2023.201.1.1svn47913-53.1.noarch.rpm"
RPM_HASH = "e764d3e54fe7d34a5974d2fb3e8f7823781017a0095575ee8bc8d7bd754642327cecb3d69c4241b08b28288bac6dfcc1019b86bf7769778557af0d6638cb9663"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-colophon-doc"
RDEPENDS:${PN} += ""

inherit rpm
