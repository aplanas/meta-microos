SUMMARY = "Documentation for texlive-tablists"
DESCRIPTION = "This package includes the documentation for texlive-tablists"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.0esvn15878"

RPM_NAME = "texlive-tablists-doc-2023.201.0.0.0esvn15878-54.1.noarch.rpm"
RPM_HASH = "0fadaec1339fce98e3a199f0b63f4d961686bcfd3ccde0065f479e16cc1f4576c69b5e3dbae7194a854837803907bcce3ff80d2e68862a6fdfd8dcb524cb1baa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tablists-doc"
RDEPENDS:${PN} += ""

inherit rpm
