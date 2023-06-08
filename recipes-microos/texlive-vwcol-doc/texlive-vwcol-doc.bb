SUMMARY = "Documentation for texlive-vwcol"
DESCRIPTION = "This package includes the documentation for texlive-vwcol"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn36254"

RPM_NAME = "texlive-vwcol-doc-2023.201.0.0.2svn36254-53.1.noarch.rpm"
RPM_HASH = "a63008d52581a6c45962951a19d0269048187cb82cc2e3a95ea3e2bd7db19f8a12842fb33bc75d9380f39a47bce733d759ab554b3fd5a836ae2a6ac52b350f8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-vwcol-doc"
RDEPENDS:${PN} += ""

inherit rpm
