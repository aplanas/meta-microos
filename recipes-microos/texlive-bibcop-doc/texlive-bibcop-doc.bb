SUMMARY = "Documentation for texlive-bibcop"
DESCRIPTION = "This package includes the documentation for texlive-bibcop"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.0.9svn65816"

RPM_NAME = "texlive-bibcop-doc-2023.201.0.0.0.9svn65816-53.1.noarch.rpm"
RPM_HASH = "36c5f35550bb60994199574942bff61f4a7ad121c928b0b1f8012e8ef350af71f77dafb0f1fbb07ff89a770dd083bbc4e223c7a892c7f5deb1d4e43a1f061ea5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(bibcop.1) texlive-bibcop-doc"
RDEPENDS:${PN} += ""

inherit rpm
