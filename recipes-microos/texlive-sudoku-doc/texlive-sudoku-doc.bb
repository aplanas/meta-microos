SUMMARY = "Documentation for texlive-sudoku"
DESCRIPTION = "This package includes the documentation for texlive-sudoku"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-sudoku-doc-2023.201.1.0svn15878-57.1.noarch.rpm"
RPM_HASH = "b4638693caeabd4e699134095e16741d909cadb5112ce37db015924670ceb9d8f11b3e91ad08e3178d5339791d6f78d386e0ccbbfab2ded9b7dd4604e3d01bfb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sudoku-doc"
RDEPENDS:${PN} += ""

inherit rpm
