SUMMARY = "Documentation for texlive-cslatex"
DESCRIPTION = "This package includes the documentation for texlive-cslatex"
LICENSE = "GPL-2.0-or-later"

PV = "2023.204.svn66186"

RPM_NAME = "texlive-cslatex-doc-2023.204.svn66186-54.1.noarch.rpm"
RPM_HASH = "a3f377fd62f3576572526f7c794ed375dc084b879c3934b5476119e95dc18f03398e6acff6d946cd951e08d7ce63f073f2673a154aa85e5636deda5a20c8b72c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(cslatex.1) \
man(pdfcslatex.1) \
texlive-cslatex-doc"
RDEPENDS:${PN} += ""

inherit rpm
