SUMMARY = "Documentation for texlive-svninfo"
DESCRIPTION = "This package includes the documentation for texlive-svninfo"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.7.4svn62157"

RPM_NAME = "texlive-svninfo-doc-2023.201.0.0.7.4svn62157-57.1.noarch.rpm"
RPM_HASH = "27f6eb0432f1fac06154338ceb26f4a34908b72e953abbb949b2c15634eb60917c3f7c23d033f74d7c005bf41d1f1dd2dbc47395ac1bd9bc4ae45a6d8a8cf8c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-svninfo-doc"
RDEPENDS:${PN} += ""

inherit rpm
