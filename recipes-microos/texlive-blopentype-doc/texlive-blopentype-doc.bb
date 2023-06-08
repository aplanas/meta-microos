SUMMARY = "Documentation for texlive-blopentype"
DESCRIPTION = "This package includes the documentation for texlive-blopentype"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.0.0svn65441"

RPM_NAME = "texlive-blopentype-doc-2023.201.0.0.0.0svn65441-52.1.noarch.rpm"
RPM_HASH = "8109db2731062ad464869dc745b7d0316c5bc5858f728b62f6174036bbcc28a16f50f4ec43dd6a7ad639ab247f1b942b0491be536341a793792164e1b080768d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-blopentype-doc"
RDEPENDS:${PN} += ""

inherit rpm
