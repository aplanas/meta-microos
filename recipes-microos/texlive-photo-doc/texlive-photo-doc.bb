SUMMARY = "Documentation for texlive-photo"
DESCRIPTION = "This package includes the documentation for texlive-photo"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn18739"

RPM_NAME = "texlive-photo-doc-2023.201.svn18739-51.1.noarch.rpm"
RPM_HASH = "9c180c882f7ff7f527c77d6b2025c1d4ffa17ed3e20d0190326fa16c92f482e761234feed5aa4fb4daef0430bf13396a59ddf22fd4140e9db19d317d6b410be1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-photo-doc"
RDEPENDS:${PN} += ""

inherit rpm
