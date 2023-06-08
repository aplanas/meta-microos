SUMMARY = "Documentation for texlive-simpler-wick"
DESCRIPTION = "This package includes the documentation for texlive-simpler-wick"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.0svn39074"

RPM_NAME = "texlive-simpler-wick-doc-2023.201.1.0.0svn39074-53.1.noarch.rpm"
RPM_HASH = "671e737f8147d34e36363feb93f14db40b5a79fcc849981ce79864c1503d738ea17a580d4002ac642e2abcb220b493b3173cfb214e479bd74bc7b189bf4733e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-simpler-wick-doc"
RDEPENDS:${PN} += ""

inherit rpm
