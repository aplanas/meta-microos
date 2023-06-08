SUMMARY = "Documentation for texlive-type1cm"
DESCRIPTION = "This package includes the documentation for texlive-type1cm"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn21820"

RPM_NAME = "texlive-type1cm-doc-2023.201.svn21820-52.1.noarch.rpm"
RPM_HASH = "8321ce05fc3ebc52803ced11dd4d54ab09494a1b6f6c4a31134f24021c396c63077cc5d8f8cf007dc4f516acbd5e743fd2ce8ed9d14a9aa57f22f59c518df842"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-type1cm-doc"
RDEPENDS:${PN} += ""

inherit rpm
