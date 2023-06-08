SUMMARY = "Documentation for texlive-ucbthesis"
DESCRIPTION = "This package includes the documentation for texlive-ucbthesis"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.6svn51690"

RPM_NAME = "texlive-ucbthesis-doc-2023.201.3.6svn51690-52.1.noarch.rpm"
RPM_HASH = "0b81d91d105ba347dfc830792b1809c80fe677731b5952d1423151e87ce8cc52a6be444c2e75713aac3db23d126340ddfc7b822ba98016514ebfb0bb49b80bdb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ucbthesis-doc"
RDEPENDS:${PN} += ""

inherit rpm
