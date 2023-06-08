SUMMARY = "Documentation for texlive-glossaries-polish"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-polish"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn35665"

RPM_NAME = "texlive-glossaries-polish-doc-2023.201.1.0svn35665-53.1.noarch.rpm"
RPM_HASH = "341610d69e3d49354f92fd5de6e059e0ef6b4875523c5c688d339cf5276cf0c9cb20160c756d010bcae036cc3707897531fdaae1f047381eb81e18a058f9b521"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-polish-doc"
RDEPENDS:${PN} += ""

inherit rpm
