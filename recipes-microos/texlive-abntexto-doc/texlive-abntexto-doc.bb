SUMMARY = "Documentation for texlive-abntexto"
DESCRIPTION = "This package includes the documentation for texlive-abntexto"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.2.0.0_alphasvn65705"

RPM_NAME = "texlive-abntexto-doc-2023.201.2.0.0_alphasvn65705-54.1.noarch.rpm"
RPM_HASH = "d4a5b09e2fd91c5ac9f92ebdc295d34e91d0a87e690f3bd573b9ff8ceefa75b16abc6932c7c402f28344c32f40a5a0e82c66d237072a03ee306e1a523d67d9ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-abntexto-doc:pt_BR) texlive-abntexto-doc"
RDEPENDS:${PN} += ""

inherit rpm
