SUMMARY = "Documentation for texlive-ncclatex"
DESCRIPTION = "This package includes the documentation for texlive-ncclatex"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn15878"

RPM_NAME = "texlive-ncclatex-doc-2023.201.1.5svn15878-54.1.noarch.rpm"
RPM_HASH = "c89830fce8bb24f34d33b408e03c111bbabb933759828d8739076f0bb68e8ad4ba40df869feb645082b5a488ee841bf17beb22d7f34bb762cdc3b61473c190eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-ncclatex-doc:ru) texlive-ncclatex-doc"
RDEPENDS:${PN} += ""

inherit rpm
