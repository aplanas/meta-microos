SUMMARY = "Documentation for texlive-grafcet"
DESCRIPTION = "This package includes the documentation for texlive-grafcet"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3.5svn22509"

RPM_NAME = "texlive-grafcet-doc-2023.201.1.3.5svn22509-53.1.noarch.rpm"
RPM_HASH = "54dbdd5c6d14924dcffb838322e2d704af9453eb75df698c12fcb175179a3693fc3902c2a4a74572d8be52dc4157a9a515cdd00b9a0d3c66ca15a0fedb2892c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-grafcet-doc:fr) texlive-grafcet-doc"
RDEPENDS:${PN} += ""

inherit rpm
