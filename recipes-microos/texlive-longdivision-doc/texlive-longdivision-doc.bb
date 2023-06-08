SUMMARY = "Documentation for texlive-longdivision"
DESCRIPTION = "This package includes the documentation for texlive-longdivision"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2.1svn59979"

RPM_NAME = "texlive-longdivision-doc-2023.201.1.2.1svn59979-54.1.noarch.rpm"
RPM_HASH = "62da3976d046bfdeed3cebc1c1a506c902ca3071221479958b381e191817daeb2b0dee91b15e6a5c608c26878ff95b8a019d56b40b16e866ef9ac1bd6a1a8b63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-longdivision-doc"
RDEPENDS:${PN} += ""

inherit rpm
