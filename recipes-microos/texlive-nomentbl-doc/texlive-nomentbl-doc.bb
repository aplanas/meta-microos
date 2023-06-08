SUMMARY = "Documentation for texlive-nomentbl"
DESCRIPTION = "This package includes the documentation for texlive-nomentbl"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4svn16549"

RPM_NAME = "texlive-nomentbl-doc-2023.201.0.0.4svn16549-54.1.noarch.rpm"
RPM_HASH = "91493e2e7f99bc60188a527a4a4f2b2112b23876068defce538fcdb7679d494812fad33fedec7e43cb23ebba49020f407127b8d4990f26f397f235826aee32d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nomentbl-doc"
RDEPENDS:${PN} += ""

inherit rpm
