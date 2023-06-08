SUMMARY = "Documentation for texlive-alegreya"
DESCRIPTION = "This package includes the documentation for texlive-alegreya"
LICENSE = "OFL-1.1"

PV = "2023.201.svn64384"

RPM_NAME = "texlive-alegreya-doc-2023.201.svn64384-54.1.noarch.rpm"
RPM_HASH = "f52f30196d688a8aa1e5cee8a96cbbd0c8fd01fdf526b5513dbe230f84a235cb720d8341db45033565c311fdb4ae542f3849254e27a7344ef235cfe3b2ab8503"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-alegreya-doc"
RDEPENDS:${PN} += ""

inherit rpm
