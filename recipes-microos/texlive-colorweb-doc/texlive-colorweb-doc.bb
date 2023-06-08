SUMMARY = "Documentation for texlive-colorweb"
DESCRIPTION = "This package includes the documentation for texlive-colorweb"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn31490"

RPM_NAME = "texlive-colorweb-doc-2023.201.1.3svn31490-53.1.noarch.rpm"
RPM_HASH = "4e51b9984c5d698b8f42766c9ac4dc1554341d66e0601e7f0529fef61b3c93d7c63937b5ddda2c7eedb665ba6143b68df4bf538cbc5b6931dc992db0a2b6bec3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-colorweb-doc"
RDEPENDS:${PN} += ""

inherit rpm
