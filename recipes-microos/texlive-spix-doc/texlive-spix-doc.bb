SUMMARY = "Documentation for texlive-spix"
DESCRIPTION = "This package includes the documentation for texlive-spix"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.3.0svn65050"

RPM_NAME = "texlive-spix-doc-2023.201.1.3.0svn65050-57.1.noarch.rpm"
RPM_HASH = "3a0d20edae911bf27f55839aaf0b3fc2b1c2c77af6621f7de0066c01fe93dd8a66fd1f0aec1228208ee1a43086618353b32fb92dc1b2813cc0e9a080807a4539"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(spix.1) texlive-spix-doc"
RDEPENDS:${PN} += ""

inherit rpm
