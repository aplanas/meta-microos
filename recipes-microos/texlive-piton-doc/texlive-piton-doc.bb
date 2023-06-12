SUMMARY = "Documentation for texlive-piton"
DESCRIPTION = "This package includes the documentation for texlive-piton"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn65835"

RPM_NAME = "texlive-piton-doc-2023.201.1.4svn65835-51.1.noarch.rpm"
RPM_HASH = "32a815558bcc8639718c5580eefcdcfec9cf9fbcb090753a3f6eb655f1ec41f507fab68fa7bfefc94d6612b65ad86efcd5032f988e4b9b9c6c70a6b7a157fb9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-piton-doc:fr) \
texlive-piton-doc"
RDEPENDS:${PN} += ""

inherit rpm
