SUMMARY = "Documentation for texlive-revquantum"
DESCRIPTION = "This package includes the documentation for texlive-revquantum"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.11svn43505"

RPM_NAME = "texlive-revquantum-doc-2023.201.0.0.11svn43505-53.1.noarch.rpm"
RPM_HASH = "0ebf5eed92f8d5ad2ce8dd8d493562a7a3f646fac72c40d0b431228105fee05e362dcb1f49357d35e1d5aa06e9916068b05278916b91addfb22b6ef8c43576cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-revquantum-doc"
RDEPENDS:${PN} += ""

inherit rpm
