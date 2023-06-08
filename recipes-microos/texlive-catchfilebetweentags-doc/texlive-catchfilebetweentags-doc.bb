SUMMARY = "Documentation for texlive-catchfilebetweentags"
DESCRIPTION = "This package includes the documentation for texlive-catchfilebetweentags"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn21476"

RPM_NAME = "texlive-catchfilebetweentags-doc-2023.201.1.1svn21476-52.1.noarch.rpm"
RPM_HASH = "31b0b969c213a0676ee9644a713d34d8edf36e5bbcdcf5c4214e5ba2012e1c417e1cef236a02eaf52cd0586817c654ca4302d75ae1b57bb445707d07f00a26a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-catchfilebetweentags-doc"
RDEPENDS:${PN} += ""

inherit rpm
