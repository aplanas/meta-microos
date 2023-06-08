SUMMARY = "Documentation for texlive-context-title"
DESCRIPTION = "This package includes the documentation for texlive-context-title"
LICENSE = "GPL-2.0-or-later"

PV = "2023.204.svn47085"

RPM_NAME = "texlive-context-title-doc-2023.204.svn47085-54.1.noarch.rpm"
RPM_HASH = "2f4cc4145379ff09e8c86477895cc814c322efb677fdbfe70006ac64928240651dc7bc9f25d44c8a827f6d3992832ed931327e258928dbb41243d5d8454e1d67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-title-doc"
RDEPENDS:${PN} += ""

inherit rpm
