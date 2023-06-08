SUMMARY = "Documentation for texlive-biblatex-phys"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-phys"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1bsvn55643"

RPM_NAME = "texlive-biblatex-phys-doc-2023.201.1.1bsvn55643-53.1.noarch.rpm"
RPM_HASH = "ca153554972f5fd70d350f4ef0a8125855038315b5a33d8395f3781019001585845e1dec0c9c401640eee0146b95046eee71bdc6f12d68b232b9b6905c5c13f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-phys-doc"
RDEPENDS:${PN} += ""

inherit rpm
