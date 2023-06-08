SUMMARY = "Documentation for texlive-tabls"
DESCRIPTION = "This package includes the documentation for texlive-tabls"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.5svn17255"

RPM_NAME = "texlive-tabls-doc-2023.201.3.5svn17255-54.1.noarch.rpm"
RPM_HASH = "b437cd31cd6e447b8f6797c3fcc4d372b8cafbd6fefd9292937cf3f533190b08ede4534bdb0d4078a1d74dc4085410f6b777a680cf0d2a9f7b11e15bc75ab5c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tabls-doc"
RDEPENDS:${PN} += ""

inherit rpm
