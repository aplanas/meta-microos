SUMMARY = "Documentation for texlive-libgreek"
DESCRIPTION = "This package includes the documentation for texlive-libgreek"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn65004"

RPM_NAME = "texlive-libgreek-doc-2023.201.1.1svn65004-54.1.noarch.rpm"
RPM_HASH = "f0a54510f4c6b0c9bf305145752d07d10123867c8cf15d38c30688314c40a8746a733ec6340245c3ef2ece086f7d08b8e39cf2d9f420ee104a2af7aa8fa24cc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-libgreek-doc"
RDEPENDS:${PN} += ""

inherit rpm
