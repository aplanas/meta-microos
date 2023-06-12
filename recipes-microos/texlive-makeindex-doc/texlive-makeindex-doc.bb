SUMMARY = "Documentation for texlive-makeindex"
DESCRIPTION = "This package includes the documentation for texlive-makeindex"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn62517"

RPM_NAME = "texlive-makeindex-doc-2023.201.svn62517-52.1.noarch.rpm"
RPM_HASH = "c748426382abb2de90e6450f9f859de347b4a098d7fb074540cd8346ed4bb2899ea0eb23bc976673a23fcbef3e9f871fc229db9eb355e9dc139ecd58b391a1cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(makeindex.1) \
man(mkindex.1) \
texlive-makeindex-doc"
RDEPENDS:${PN} += ""

inherit rpm
