SUMMARY = "Documentation for texlive-pdftex-quiet"
DESCRIPTION = "This package includes the documentation for texlive-pdftex-quiet"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.1.0svn49169"

RPM_NAME = "texlive-pdftex-quiet-doc-2023.201.1.1.0svn49169-51.1.noarch.rpm"
RPM_HASH = "139f390ced24ea7fbff50039360721b89ee07f68f811f452b466118cf58657f30dc6e9c50dee065d04e351ae88abe85c0ad29395579cf6b8dd03587745c5736a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdftex-quiet-doc"
RDEPENDS:${PN} += ""

inherit rpm
