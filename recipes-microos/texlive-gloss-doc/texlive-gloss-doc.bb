SUMMARY = "Documentation for texlive-gloss"
DESCRIPTION = "This package includes the documentation for texlive-gloss"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5.2svn15878"

RPM_NAME = "texlive-gloss-doc-2023.201.1.5.2svn15878-53.1.noarch.rpm"
RPM_HASH = "6fb515ca534a9913f5b9c77d61e5ceb5955439468258c36bd4cd2109c1ba1f190eb6c7994ee425ea754611f70ac3d66c6dd51ad7e0394f1e4fcf35803d43d8a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gloss-doc"
RDEPENDS:${PN} += ""

inherit rpm
