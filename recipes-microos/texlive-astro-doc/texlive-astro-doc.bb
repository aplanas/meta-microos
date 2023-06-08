SUMMARY = "Documentation for texlive-astro"
DESCRIPTION = "This package includes the documentation for texlive-astro"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.20svn15878"

RPM_NAME = "texlive-astro-doc-2023.201.2.20svn15878-53.1.noarch.rpm"
RPM_HASH = "686248ba81224097a84bee99c43e5d7f077865308351fcc496e476726cb715ea2f7074a5ef9dcb91eda1cf9a207b61d3f5b4491752837195f03d0d07082e02be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-astro-doc"
RDEPENDS:${PN} += ""

inherit rpm
