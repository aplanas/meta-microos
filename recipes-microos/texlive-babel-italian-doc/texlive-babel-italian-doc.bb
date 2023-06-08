SUMMARY = "Documentation for texlive-babel-italian"
DESCRIPTION = "This package includes the documentation for texlive-babel-italian"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4.07svn62890"

RPM_NAME = "texlive-babel-italian-doc-2023.201.1.4.07svn62890-53.1.noarch.rpm"
RPM_HASH = "cb0118c3e278aeb3099c002cabec06d8f861783123a98779db23d3da0f66ec9e14b2a0250c2312316ece9323aea32e2d40bc81efbe10afb161e07c0fa696d7ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-italian-doc"
RDEPENDS:${PN} += ""

inherit rpm
