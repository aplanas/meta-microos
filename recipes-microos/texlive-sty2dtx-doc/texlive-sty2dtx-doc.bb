SUMMARY = "Documentation for texlive-sty2dtx"
DESCRIPTION = "This package includes the documentation for texlive-sty2dtx"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.2.4svn64967"

RPM_NAME = "texlive-sty2dtx-doc-2023.201.2.4svn64967-57.1.noarch.rpm"
RPM_HASH = "271e0125a1d3ee9268906904af1e44766720f03c3a444bc02566277af5a2acb608a323c9777cb82b5fea35cd153c2106bc6605319c6c8439cc5b67175021cad8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(sty2dtx.1) texlive-sty2dtx-doc"
RDEPENDS:${PN} += ""

inherit rpm
