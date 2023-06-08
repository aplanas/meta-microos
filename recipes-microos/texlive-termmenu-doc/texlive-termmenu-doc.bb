SUMMARY = "Documentation for texlive-termmenu"
DESCRIPTION = "This package includes the documentation for texlive-termmenu"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn37700"

RPM_NAME = "texlive-termmenu-doc-2023.201.svn37700-54.1.noarch.rpm"
RPM_HASH = "1d3d8db7f842fa6922783122e8c33ca4cfdbecf7b20f53b82485366f8719a9d144f815b1a2a759afb968de4ab546260fc500faca5c205cd653ec779aa47a3136"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-termmenu-doc"
RDEPENDS:${PN} += ""

inherit rpm
