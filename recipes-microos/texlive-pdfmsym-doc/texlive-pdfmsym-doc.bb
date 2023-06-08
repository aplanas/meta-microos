SUMMARY = "Documentation for texlive-pdfmsym"
DESCRIPTION = "This package includes the documentation for texlive-pdfmsym"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1.0svn65324"

RPM_NAME = "texlive-pdfmsym-doc-2023.201.1.1.0svn65324-51.1.noarch.rpm"
RPM_HASH = "ebc7356550640741d60b03d6af9dfc815715e5615024e7f4a082170cf7564b47b4669bf3a9aa78c54f4858b11d9120bb459ddaeca9471841b7e02b701a05cf33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdfmsym-doc"
RDEPENDS:${PN} += ""

inherit rpm
