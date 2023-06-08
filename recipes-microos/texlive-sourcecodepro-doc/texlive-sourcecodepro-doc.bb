SUMMARY = "Documentation for texlive-sourcecodepro"
DESCRIPTION = "This package includes the documentation for texlive-sourcecodepro"
LICENSE = "OFL-1.1"

PV = "2023.201.2.7svn54512"

RPM_NAME = "texlive-sourcecodepro-doc-2023.201.2.7svn54512-57.1.noarch.rpm"
RPM_HASH = "1d02f47e719bc8b196a01d3866744959d7300144f1fef4580d4fb45f4637574650426591514fe429ced2a228b7fb0ddf80f2d6fd8cba3d198026694bb1835d10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sourcecodepro-doc"
RDEPENDS:${PN} += ""

inherit rpm
