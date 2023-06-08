SUMMARY = "Documentation for texlive-xtuthesis"
DESCRIPTION = "This package includes the documentation for texlive-xtuthesis"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn47049"

RPM_NAME = "texlive-xtuthesis-doc-2023.201.1.0svn47049-52.1.noarch.rpm"
RPM_HASH = "fef8e610d8b7fec779a7ae6215998b79db39394b1ba278c987c7b918145a9730c636f45c80107abe5aa9960a2df870213dee02aa932d734caa5e52d35584bd95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-xtuthesis-doc:zh) texlive-xtuthesis-doc"
RDEPENDS:${PN} += ""

inherit rpm
