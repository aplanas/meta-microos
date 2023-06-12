SUMMARY = "Documentation for texlive-vntex"
DESCRIPTION = "This package includes the documentation for texlive-vntex"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.2.2svn62837"

RPM_NAME = "texlive-vntex-doc-2023.201.3.2.2svn62837-53.1.noarch.rpm"
RPM_HASH = "1579d2e13f6cbc3e4873d9970d1af2dbc144c76e0314da23db5ab884ab3ac0044dd7809ad1dffe2d72b0aa1d9e068e8ac340bbb534279965a74dbf3fc2c53dab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-vntex-doc:en;vi) \
texlive-vntex-doc"
RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
