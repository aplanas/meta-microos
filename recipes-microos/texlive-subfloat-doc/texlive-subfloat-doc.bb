SUMMARY = "Documentation for texlive-subfloat"
DESCRIPTION = "This package includes the documentation for texlive-subfloat"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.14svn29349"

RPM_NAME = "texlive-subfloat-doc-2023.201.2.14svn29349-57.1.noarch.rpm"
RPM_HASH = "7deb254f76f58891e52061d6f41b5bf78272289d333f35ba246d22012d54f59b5ebb1bb1a2a174277d38c86ad770e53af29eedf272eea42e1b3b0def87a93f8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-subfloat-doc"
RDEPENDS:${PN} += ""

inherit rpm
