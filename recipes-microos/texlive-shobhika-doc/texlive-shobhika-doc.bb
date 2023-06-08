SUMMARY = "Documentation for texlive-shobhika"
DESCRIPTION = "This package includes the documentation for texlive-shobhika"
LICENSE = "OFL-1.1"

PV = "2023.201.1.05svn50555"

RPM_NAME = "texlive-shobhika-doc-2023.201.1.05svn50555-53.1.noarch.rpm"
RPM_HASH = "f5887ab86883eb7abdc97970b517b1334e991ed3eddbd47dbdb0b8dea36a4210d2c1cda9349264fc2c324f39c86f71f07c55bafac253cc81287a4a3e08a0e6ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-shobhika-doc"
RDEPENDS:${PN} += ""

inherit rpm
