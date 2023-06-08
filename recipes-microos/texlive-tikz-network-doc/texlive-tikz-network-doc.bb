SUMMARY = "Documentation for texlive-tikz-network"
DESCRIPTION = "This package includes the documentation for texlive-tikz-network"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.1svn51884"

RPM_NAME = "texlive-tikz-network-doc-2023.201.1.1svn51884-52.1.noarch.rpm"
RPM_HASH = "e59016b3c93e61143c06d462923fdea960a0ebc1735cec7b5e12eec2ff5d46f3ce6531556532ff0e17bf3288f6632d043c6f8bf08d10365fb6ce07d7c8387e39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-network-doc"
RDEPENDS:${PN} += ""

inherit rpm
