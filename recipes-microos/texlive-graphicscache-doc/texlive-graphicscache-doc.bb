SUMMARY = "Documentation for texlive-graphicscache"
DESCRIPTION = "This package includes the documentation for texlive-graphicscache"
LICENSE = "BSD-3-Clause"

PV = "2023.201.0.0.4svn65318"

RPM_NAME = "texlive-graphicscache-doc-2023.201.0.0.4svn65318-53.1.noarch.rpm"
RPM_HASH = "43f8f677f07616f61f2c45165b330f2cc3a7d33dae41ea1875ce6b3f288a2890ad5dd84f74b192dcb9490060bcb527c3033d5e6f1653ba1b3725c9aad5ba2a6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-graphicscache-doc"
RDEPENDS:${PN} += ""

inherit rpm
