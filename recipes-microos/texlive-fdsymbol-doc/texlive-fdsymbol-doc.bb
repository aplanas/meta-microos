SUMMARY = "Documentation for texlive-fdsymbol"
DESCRIPTION = "This package includes the documentation for texlive-fdsymbol"
LICENSE = "OFL-1.1"

PV = "2023.201.0.0.8svn61719"

RPM_NAME = "texlive-fdsymbol-doc-2023.201.0.0.8svn61719-52.1.noarch.rpm"
RPM_HASH = "ee47e4117121b6295374c6fb7246868b90213695628f25c4693e611b0e853d2dca1c8b83bd2aef6d369f585e6ac793946aa1a801b8ae341782afa24cf7ad87b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fdsymbol-doc"
RDEPENDS:${PN} += ""

inherit rpm
