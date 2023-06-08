SUMMARY = "Documentation for texlive-cstypo"
DESCRIPTION = "This package includes the documentation for texlive-cstypo"
LICENSE = "LPPL-1.0"

PV = "2023.204.0.0.03svn41986"

RPM_NAME = "texlive-cstypo-doc-2023.204.0.0.03svn41986-54.1.noarch.rpm"
RPM_HASH = "833a5511c0f8f2d3bb57e6123e11bf34479eb2ed488c798f09bc0563e2305c861cc370b0189974570b159c3744b1d6b132c44c2be647e47fab94249dff3b4b91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cstypo-doc"
RDEPENDS:${PN} += ""

inherit rpm
