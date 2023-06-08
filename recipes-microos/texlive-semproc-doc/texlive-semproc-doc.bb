SUMMARY = "Documentation for texlive-semproc"
DESCRIPTION = "This package includes the documentation for texlive-semproc"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn37568"

RPM_NAME = "texlive-semproc-doc-2023.201.0.0.1svn37568-53.1.noarch.rpm"
RPM_HASH = "fc1cc41b6c83b8a65e33223f8ab75eda1c58726a90ad326d96ee9976892d0357a7bc31a10922f7897c33ced28cd6b68b3750658c9d0a126a71f72ee0a195c12e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-semproc-doc"
RDEPENDS:${PN} += ""

inherit rpm
