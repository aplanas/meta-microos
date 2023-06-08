SUMMARY = "Documentation for texlive-metrix"
DESCRIPTION = "This package includes the documentation for texlive-metrix"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn52323"

RPM_NAME = "texlive-metrix-doc-2023.201.1.5svn52323-54.1.noarch.rpm"
RPM_HASH = "d374717fe7a820a881ffe03c6cbf79593449a6dd5b2b095c17498ae60045e58253e8e294d2020522f3e0757cc822f223205ee685ca0c775d91a3d9acab9e6a06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-metrix-doc"
RDEPENDS:${PN} += ""

inherit rpm
