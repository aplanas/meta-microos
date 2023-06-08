SUMMARY = "Documentation for texlive-minidocument"
DESCRIPTION = "This package includes the documentation for texlive-minidocument"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn43752"

RPM_NAME = "texlive-minidocument-doc-2023.201.1.0svn43752-54.1.noarch.rpm"
RPM_HASH = "22981b100e7c5ab934367aecdbd978d61bbfeb809a21640e53a66e98f271ec6941c4239e33eba53168e116bb7dc8a85357f04b78816fd32dc6100087ba0bded9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-minidocument-doc"
RDEPENDS:${PN} += ""

inherit rpm
