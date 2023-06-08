SUMMARY = "Documentation for texlive-showlabels"
DESCRIPTION = "This package includes the documentation for texlive-showlabels"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.9.2svn63940"

RPM_NAME = "texlive-showlabels-doc-2023.201.1.9.2svn63940-53.1.noarch.rpm"
RPM_HASH = "065d029100258f0b09d862dad4caa541d8be5ba912d77d988228105a0db6ad71c5639d6e90b3dfe709dd160da122e790c30597519a12e2e3cf330c91726111e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-showlabels-doc"
RDEPENDS:${PN} += ""

inherit rpm
