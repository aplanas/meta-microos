SUMMARY = "Documentation for texlive-latexbangla"
DESCRIPTION = "This package includes the documentation for texlive-latexbangla"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn55475"

RPM_NAME = "texlive-latexbangla-doc-2023.201.0.0.2svn55475-54.1.noarch.rpm"
RPM_HASH = "fb29e57d05ebb6d1607764222b44c80ca7f5a6135df3ed2609792c5aa9e6eb175f13e4efeaa7e3943e3cd2623761fd2794d3b4e6140d5a2dcc2792d6a5dcc6c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latexbangla-doc"
RDEPENDS:${PN} += ""

inherit rpm
