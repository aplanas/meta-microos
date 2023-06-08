SUMMARY = "Documentation for texlive-qyxf-book"
DESCRIPTION = "This package includes the documentation for texlive-qyxf-book"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.1.0svn56319"

RPM_NAME = "texlive-qyxf-book-doc-2023.201.3.1.0svn56319-53.1.noarch.rpm"
RPM_HASH = "b2af5e27278f501cc2eb4c2964c13cf8025c6e7c43466c159d2646a3fbc7e3f746b197fc5b65ddfec824532024cc471367110b7e1533c1bbaa5071065b98ac34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-qyxf-book-doc:zh) texlive-qyxf-book-doc"
RDEPENDS:${PN} += ""

inherit rpm
