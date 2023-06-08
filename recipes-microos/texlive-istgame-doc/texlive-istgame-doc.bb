SUMMARY = "Documentation for texlive-istgame"
DESCRIPTION = "This package includes the documentation for texlive-istgame"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1svn62946"

RPM_NAME = "texlive-istgame-doc-2023.201.2.1svn62946-55.1.noarch.rpm"
RPM_HASH = "96a711d9810bb6f453a35aeebe8c633fb52d28954adf6cf99da734b676aae582f587cbdc36300ea84acc5bcd02e9373c608286d8a1433a43c3c80805189e090e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-istgame-doc"
RDEPENDS:${PN} += ""

inherit rpm
