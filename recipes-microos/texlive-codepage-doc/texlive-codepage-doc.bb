SUMMARY = "Documentation for texlive-codepage"
DESCRIPTION = "This package includes the documentation for texlive-codepage"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn51502"

RPM_NAME = "texlive-codepage-doc-2023.201.svn51502-53.1.noarch.rpm"
RPM_HASH = "95b07c8772e3cb715db6d1eadafc95df7e52fba788d5e056981368770801cc160bc72870e854f5dc54866099e646f7c925b2f2ed831f3f706b0bf158c7131688"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-codepage-doc:fr;en) \
texlive-codepage-doc"
RDEPENDS:${PN} += ""

inherit rpm
