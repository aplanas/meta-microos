SUMMARY = "Documentation for texlive-randomwalk"
DESCRIPTION = "This package includes the documentation for texlive-randomwalk"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.6svn49513"

RPM_NAME = "texlive-randomwalk-doc-2023.201.0.0.6svn49513-53.1.noarch.rpm"
RPM_HASH = "836372b9906e8140f00f5a4bb78a3bf62aea7c72432c95b172de6eb09d273bc924acacd61bac51ca64a00240d883bc7a46bcd087603a7e68d098ea12e3f17225"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-randomwalk-doc"
RDEPENDS:${PN} += ""

inherit rpm
