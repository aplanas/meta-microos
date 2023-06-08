SUMMARY = "Documentation for texlive-nlctdoc"
DESCRIPTION = "This package includes the documentation for texlive-nlctdoc"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.08svn64708"

RPM_NAME = "texlive-nlctdoc-doc-2023.201.1.08svn64708-54.1.noarch.rpm"
RPM_HASH = "fb74880c882ca439203d442f1231f9675fb7a4a2bc06e37bb7807d115d3b08b82b7b388d84d3063694762689222eeb828e0478fc54f7709a90acbdd80c247248"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nlctdoc-doc"
RDEPENDS:${PN} += ""

inherit rpm
