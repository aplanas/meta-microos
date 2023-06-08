SUMMARY = "Documentation for texlive-lua-visual-debug"
DESCRIPTION = "This package includes the documentation for texlive-lua-visual-debug"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.9svn65464"

RPM_NAME = "texlive-lua-visual-debug-doc-2023.201.0.0.9svn65464-52.1.noarch.rpm"
RPM_HASH = "3a76c55f51a7fff6580aa82061b0115c00d2976450a89f28478476106f53c2ff9eabaa12e236571d90913370f7709a2e39d2421c7b3f2ee21005cbf6cacea98b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lua-visual-debug-doc"
RDEPENDS:${PN} += ""

inherit rpm
