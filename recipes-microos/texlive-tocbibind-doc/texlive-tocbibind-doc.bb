SUMMARY = "Documentation for texlive-tocbibind"
DESCRIPTION = "This package includes the documentation for texlive-tocbibind"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5ksvn20085"

RPM_NAME = "texlive-tocbibind-doc-2023.201.1.5ksvn20085-52.1.noarch.rpm"
RPM_HASH = "6f6564440657c297a7a162f36fe6fe29b162d353a211d2e82416a8f3f2ccb8f5cb3bcabc76d0366b355f2415aee99c9a45b84f1dd7dc9e0fbd35629c73186df2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tocbibind-doc"
RDEPENDS:${PN} += ""

inherit rpm
