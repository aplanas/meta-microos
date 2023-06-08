SUMMARY = "Documentation for texlive-pst-feyn"
DESCRIPTION = "This package includes the documentation for texlive-pst-feyn"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.01svn48781"

RPM_NAME = "texlive-pst-feyn-doc-2023.201.0.0.01svn48781-52.1.noarch.rpm"
RPM_HASH = "7e58f69ab62b89a2d83b5b5a66151799d36ac055f19cc7089951a83a9ccfc66bd03fe2bb05f58fdb62dbf5ee7ca8408141b81d0859646a723d0fceafa07a4c71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-feyn-doc"
RDEPENDS:${PN} += ""

inherit rpm
