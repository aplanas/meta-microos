SUMMARY = "Documentation for texlive-latex2nemeth"
DESCRIPTION = "This package includes the documentation for texlive-latex2nemeth"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.1.3svn65269"

RPM_NAME = "texlive-latex2nemeth-doc-2023.201.1.1.3svn65269-54.1.noarch.rpm"
RPM_HASH = "8c891fe1c84a3f3a029a5c3d85004162214f10d6be7a3c6877a0d5c46a188f967888b4cd997164007eea5927bb6cb4495961f9cf081622fc544b62806d3576d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex2nemeth-doc"
RDEPENDS:${PN} += ""

inherit rpm
