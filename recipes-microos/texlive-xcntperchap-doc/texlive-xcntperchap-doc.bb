SUMMARY = "Documentation for texlive-xcntperchap"
DESCRIPTION = "This package includes the documentation for texlive-xcntperchap"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5svn54080"

RPM_NAME = "texlive-xcntperchap-doc-2023.201.0.0.5svn54080-52.1.noarch.rpm"
RPM_HASH = "338b015a8b0c0dcb5d36afd9122b89d5dabd0fecf9613ac0df4cecae3f3a8d4e06599c5029fb9bf9c12bd7f574daff4e050b5672a4c1315744a622980e139147"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xcntperchap-doc"
RDEPENDS:${PN} += ""

inherit rpm
