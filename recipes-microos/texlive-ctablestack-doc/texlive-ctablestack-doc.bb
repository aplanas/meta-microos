SUMMARY = "Documentation for texlive-ctablestack"
DESCRIPTION = "This package includes the documentation for texlive-ctablestack"
LICENSE = "LPPL-1.0"

PV = "2023.204.1.0svn38514"

RPM_NAME = "texlive-ctablestack-doc-2023.204.1.0svn38514-54.1.noarch.rpm"
RPM_HASH = "f3016b8001cb69ce39f3c707423c7f06b2b466708054d5bbf926b4f1558b60646bce8e510809fb5b013177f555216de99835f5ce3536b21e21e13173c530d8f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ctablestack-doc"
RDEPENDS:${PN} += ""

inherit rpm
