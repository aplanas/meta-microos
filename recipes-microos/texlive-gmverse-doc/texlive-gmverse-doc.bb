SUMMARY = "Documentation for texlive-gmverse"
DESCRIPTION = "This package includes the documentation for texlive-gmverse"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.73svn29803"

RPM_NAME = "texlive-gmverse-doc-2023.201.0.0.73svn29803-53.1.noarch.rpm"
RPM_HASH = "d7d45fd049c690d6dc18c42a3bc2e17a971ad75e035ed0ae0d75a5232a24f315789d9a0a54b4cec046e3560ddf775f3d8d9fb03863f28e761451ae9bec75e252"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gmverse-doc"
RDEPENDS:${PN} += ""

inherit rpm
