SUMMARY = "Documentation for texlive-babel-spanish"
DESCRIPTION = "This package includes the documentation for texlive-babel-spanish"
LICENSE = "LPPL-1.0"

PV = "2023.201.5.0qsvn59367"

RPM_NAME = "texlive-babel-spanish-doc-2023.201.5.0qsvn59367-53.1.noarch.rpm"
RPM_HASH = "c1097b924034f4f951c6731863da822dca7e4d1cf0350484b976375295e4d7fa767491cdbdca1dccb490a899b1cd6aa650741441b88cf741467d7a8f94e1220b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-babel-spanish-doc:es) \
texlive-babel-spanish-doc"
RDEPENDS:${PN} += ""

inherit rpm
