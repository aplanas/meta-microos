SUMMARY = "Documentation for texlive-ltximg"
DESCRIPTION = "This package includes the documentation for texlive-ltximg"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.2.1svn59335"

RPM_NAME = "texlive-ltximg-doc-2023.201.2.1svn59335-52.1.noarch.rpm"
RPM_HASH = "b6f9feb305cbfd017c9a87fe7b658cce5263a4c57ae87c8fa1c420ddcc989894773269508d616ffca98917152dad0f9a6cf7382d9b4cefeb6aa4f63c3f488522"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(ltximg.1) texlive-ltximg-doc"
RDEPENDS:${PN} += ""

inherit rpm
