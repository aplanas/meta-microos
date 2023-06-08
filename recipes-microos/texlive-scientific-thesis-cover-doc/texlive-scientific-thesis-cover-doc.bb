SUMMARY = "Documentation for texlive-scientific-thesis-cover"
DESCRIPTION = "This package includes the documentation for texlive-scientific-thesis-cover"
LICENSE = "LPPL-1.0"

PV = "2023.201.4.0.2svn47923"

RPM_NAME = "texlive-scientific-thesis-cover-doc-2023.201.4.0.2svn47923-53.1.noarch.rpm"
RPM_HASH = "754ba2e514cd699b4e3f199ff67224948846a4b8e731cfbffaa64131deb604dd72412a26c5ef3dad607135e71d9b30ca6ecb3080a4046f5dbdd7e64944a98d36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-scientific-thesis-cover-doc"
RDEPENDS:${PN} += ""

inherit rpm
