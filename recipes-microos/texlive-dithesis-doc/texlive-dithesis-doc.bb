SUMMARY = "Documentation for texlive-dithesis"
DESCRIPTION = "This package includes the documentation for texlive-dithesis"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn34295"

RPM_NAME = "texlive-dithesis-doc-2023.201.0.0.2svn34295-52.1.noarch.rpm"
RPM_HASH = "45b6022f14485c59d3e8e6294cc6fbe0bf1e1e7982bdf964152fe78244043e3f8b9258f2412c21bb9845e9c17710bce9f902b9cc9650d993e200a65ebfcdac54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dithesis-doc"
RDEPENDS:${PN} += ""

inherit rpm
