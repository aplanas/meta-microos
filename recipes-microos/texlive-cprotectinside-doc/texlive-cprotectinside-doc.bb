SUMMARY = "Documentation for texlive-cprotectinside"
DESCRIPTION = "This package includes the documentation for texlive-cprotectinside"
LICENSE = "LPPL-1.0"

PV = "2023.204.0.0.0.0svn63833"

RPM_NAME = "texlive-cprotectinside-doc-2023.204.0.0.0.0svn63833-54.1.noarch.rpm"
RPM_HASH = "e51958c2b9293974f79b007d1be90b327ad5886c9e61de4c18e00492434b9e3b4a0403e01f37b93108e84aaeaa5d96718277398019c9e42d2f717232863102fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cprotectinside-doc"
RDEPENDS:${PN} += ""

inherit rpm
