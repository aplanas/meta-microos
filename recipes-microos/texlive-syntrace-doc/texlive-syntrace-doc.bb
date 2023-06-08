SUMMARY = "Documentation for texlive-syntrace"
DESCRIPTION = "This package includes the documentation for texlive-syntrace"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn15878"

RPM_NAME = "texlive-syntrace-doc-2023.201.1.1svn15878-57.1.noarch.rpm"
RPM_HASH = "5a283a1769adb8b81b2f735c4abb506ebd0c0000598ea7e217a18bc814bb5d56de42781eb5dadfa76a2b1b1b6c11a1832d89a966e7891150996388cb1b030532"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-syntrace-doc"
RDEPENDS:${PN} += ""

inherit rpm
