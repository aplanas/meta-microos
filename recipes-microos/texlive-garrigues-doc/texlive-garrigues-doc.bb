SUMMARY = "Documentation for texlive-garrigues"
DESCRIPTION = "This package includes the documentation for texlive-garrigues"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-garrigues-doc-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "c1074aeb0590529b2848639d6cb4796935cf1bd4e80a15cb7f4a4828ac769ea189dcd029a27306fef49fb0a9584df6c338f28481fe025adf5d4eca5bf30a2d5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-garrigues-doc"
RDEPENDS:${PN} += ""

inherit rpm
