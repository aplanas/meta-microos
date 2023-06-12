SUMMARY = "Documentation for texlive-hyperref"
DESCRIPTION = "This package includes the documentation for texlive-hyperref"
LICENSE = "LPPL-1.0"

PV = "2023.201.7.00vsvn65758"

RPM_NAME = "texlive-hyperref-doc-2023.201.7.00vsvn65758-52.1.noarch.rpm"
RPM_HASH = "cfce5d458579b25ed45fdc7cef6453e737a3a48c1159aafecdf9e0694c4ebccbe58efa440e644b4172bd7ec996ec4f22cdddc7675c750d20cf4a3988dd0c43b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-hyperref-doc:en) \
texlive-hyperref-doc"
RDEPENDS:${PN} += ""

inherit rpm
