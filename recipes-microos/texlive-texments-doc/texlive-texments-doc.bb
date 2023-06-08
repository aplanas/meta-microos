SUMMARY = "Documentation for texlive-texments"
DESCRIPTION = "This package includes the documentation for texlive-texments"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2.0svn15878"

RPM_NAME = "texlive-texments-doc-2023.201.0.0.2.0svn15878-54.1.noarch.rpm"
RPM_HASH = "ab4f370b6c8e9799510ec5ea5ac37d6a1558e0cce0c6e944d2d3d1dcbf0ebd101fbe1e32b1d7b5931b03186e3530ff133eab85caaf70f298e58ed4959e37f81e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texments-doc"
RDEPENDS:${PN} += ""

inherit rpm
