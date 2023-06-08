SUMMARY = "Documentation for texlive-piff"
DESCRIPTION = "This package includes the documentation for texlive-piff"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn21894"

RPM_NAME = "texlive-piff-doc-2023.201.svn21894-51.1.noarch.rpm"
RPM_HASH = "43005d6660bfaf4b2b07c9751e870400b1edf1755c015936f2f50fe9bfafa5bd9a5f68530278c01bb38460e9be8ee1a4aec10fda828cae660bee2b23eaf7cdcc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-piff-doc"
RDEPENDS:${PN} += ""

inherit rpm
