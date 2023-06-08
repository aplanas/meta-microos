SUMMARY = "Documentation for texlive-inter"
DESCRIPTION = "This package includes the documentation for texlive-inter"
LICENSE = "OFL-1.1"

PV = "2023.201.svn58892"

RPM_NAME = "texlive-inter-doc-2023.201.svn58892-52.1.noarch.rpm"
RPM_HASH = "eb2d9651ff100a033a32a436765777085a0cd00890f2b541b48ce80fa7f0fdfa89d941e104a0afe3d13404323651d0936a3ff6727a184bc18f6a205c860b71e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-inter-doc"
RDEPENDS:${PN} += ""

inherit rpm
