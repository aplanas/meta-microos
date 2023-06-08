SUMMARY = "Documentation for texlive-todonotes"
DESCRIPTION = "This package includes the documentation for texlive-todonotes"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1.6svn65699"

RPM_NAME = "texlive-todonotes-doc-2023.201.1.1.6svn65699-52.1.noarch.rpm"
RPM_HASH = "fcf8affb7e421ef0c7a38c63a79d5d753a141d71cd5b1aaf077601c826ed332e8e79fcae4a122c434af612951c84752aaa2420a724125498ada6cba1210df5c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-todonotes-doc"
RDEPENDS:${PN} += ""

inherit rpm
