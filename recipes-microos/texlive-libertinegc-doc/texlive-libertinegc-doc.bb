SUMMARY = "Documentation for texlive-libertinegc"
DESCRIPTION = "This package includes the documentation for texlive-libertinegc"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.01svn44616"

RPM_NAME = "texlive-libertinegc-doc-2023.201.1.01svn44616-54.1.noarch.rpm"
RPM_HASH = "b43955e43b1501eba3d59d800d262b98eba827052b5ddc0f9857f769d0ed19241b1992eb747d085827140e755bb811a2594be4b8db6eb65c8d3d027d3742be7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-libertinegc-doc"
RDEPENDS:${PN} += ""

inherit rpm
