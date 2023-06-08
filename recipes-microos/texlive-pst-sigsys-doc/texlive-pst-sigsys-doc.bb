SUMMARY = "Documentation for texlive-pst-sigsys"
DESCRIPTION = "This package includes the documentation for texlive-pst-sigsys"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn21667"

RPM_NAME = "texlive-pst-sigsys-doc-2023.201.1.4svn21667-53.1.noarch.rpm"
RPM_HASH = "619335de2555aeb41c7ff7e35f6823a99e5e939316417263668bfe813852f245e59128b82099c1f7ed446bcbc1026ecf7598f2a9da344685a4dedaf9ed0ebce6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-sigsys-doc"
RDEPENDS:${PN} += ""

inherit rpm
