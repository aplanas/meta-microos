SUMMARY = "Documentation for texlive-easyreview"
DESCRIPTION = "This package includes the documentation for texlive-easyreview"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn38352"

RPM_NAME = "texlive-easyreview-doc-2023.201.1.0svn38352-53.1.noarch.rpm"
RPM_HASH = "86d42ba3e4564311d41126b54dbb943250c69934f6fc847111e05bb5ef38d27387fafe14147f74db7938d40a51917c999c6decabb6bc76f4e0fa310f7027e9c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-easyreview-doc"
RDEPENDS:${PN} += ""

inherit rpm
