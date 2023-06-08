SUMMARY = "Documentation for texlive-fixme"
DESCRIPTION = "This package includes the documentation for texlive-fixme"
LICENSE = "LPPL-1.0"

PV = "2023.201.4.5svn63708"

RPM_NAME = "texlive-fixme-doc-2023.201.4.5svn63708-52.1.noarch.rpm"
RPM_HASH = "bffca634f8c383a325abdb79f5d86495a952533f0f47f19d6e498af62946795eb561a22dfdea22df5801d0196e29b1792954c2e710d4cd6f63c1bc81d36bfb23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fixme-doc"
RDEPENDS:${PN} += ""

inherit rpm
