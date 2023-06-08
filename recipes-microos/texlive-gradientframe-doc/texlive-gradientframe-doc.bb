SUMMARY = "Documentation for texlive-gradientframe"
DESCRIPTION = "This package includes the documentation for texlive-gradientframe"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn21387"

RPM_NAME = "texlive-gradientframe-doc-2023.201.0.0.2svn21387-53.1.noarch.rpm"
RPM_HASH = "1b13ca63f0263a606ca4247100ae32f1451819191494abc2222a94a1c116d74b2b2614d6793c63706963db617be8742292b3cf07356897468a16e2d4f45df056"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gradientframe-doc"
RDEPENDS:${PN} += ""

inherit rpm
