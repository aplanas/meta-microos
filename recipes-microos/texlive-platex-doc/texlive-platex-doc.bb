SUMMARY = "Documentation for texlive-platex"
DESCRIPTION = "This package includes the documentation for texlive-platex"
LICENSE = "BSD-3-Clause"

PV = "2023.201.svn66186"

RPM_NAME = "texlive-platex-doc-2023.201.svn66186-52.1.noarch.rpm"
RPM_HASH = "d0f493a2d677c6b8ee2a2001ffad483bc2f2d9ff73db66ded39d67ee8abf97767f22c07fb38182f1bfcd16d806af0a3acbbc2fd41a141a2028db3397e5a485aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-platex-doc:ja) \
man(platex.1) \
texlive-platex-doc"
RDEPENDS:${PN} += ""

inherit rpm
