SUMMARY = "Documentation for texlive-citeref"
DESCRIPTION = "This package includes the documentation for texlive-citeref"
LICENSE = "BSD-3-Clause"

PV = "2023.201.1.1svn47407"

RPM_NAME = "texlive-citeref-doc-2023.201.1.1svn47407-53.1.noarch.rpm"
RPM_HASH = "6423137f998d0e6a52eda955d21669cf0669205b9735e5f8adf6575ec6c9be039fd2c366c11f19f0cbbef04742fc74b09819b1b42c61eba7c0ab9053822e9a50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-citeref-doc"
RDEPENDS:${PN} += ""

inherit rpm
