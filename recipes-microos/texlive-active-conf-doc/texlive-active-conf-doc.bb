SUMMARY = "Documentation for texlive-active-conf"
DESCRIPTION = "This package includes the documentation for texlive-active-conf"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3asvn15878"

RPM_NAME = "texlive-active-conf-doc-2023.201.0.0.3asvn15878-54.1.noarch.rpm"
RPM_HASH = "758d348e34bbae7e67dd080461b005063357d4145bcd5740785c835df7f358bb9f488c1c5062c2baf509153f86b8406b29d6a65c50a64f1e55dd9115f7194fca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-active-conf-doc"
RDEPENDS:${PN} += ""

inherit rpm
