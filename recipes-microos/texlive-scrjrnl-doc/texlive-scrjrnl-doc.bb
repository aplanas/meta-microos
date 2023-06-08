SUMMARY = "Documentation for texlive-scrjrnl"
DESCRIPTION = "This package includes the documentation for texlive-scrjrnl"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn27810"

RPM_NAME = "texlive-scrjrnl-doc-2023.201.0.0.1svn27810-53.1.noarch.rpm"
RPM_HASH = "481cb841df1fa2d16af5c3d2aa30131b9d491abcc7f16389397ba8ca8ca4eccd60c53fdf439a2d3f6d9ed28eb6159e78187e305dcc3658aef7cc60a8b53bb71d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-scrjrnl-doc"
RDEPENDS:${PN} += ""

inherit rpm
