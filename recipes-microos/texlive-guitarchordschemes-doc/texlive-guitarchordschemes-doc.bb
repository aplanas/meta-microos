SUMMARY = "Documentation for texlive-guitarchordschemes"
DESCRIPTION = "This package includes the documentation for texlive-guitarchordschemes"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.7svn54512"

RPM_NAME = "texlive-guitarchordschemes-doc-2023.201.0.0.7svn54512-53.1.noarch.rpm"
RPM_HASH = "5bebb5d27a794d71622f88ffa4c9a05bd8dd0f3a070f96824f4ef9fa3a0d5f43fb4553ad23ac569fda4250f404fe20044e61f7a13397c048c5751b5182c5e82e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-guitarchordschemes-doc:en) texlive-guitarchordschemes-doc"
RDEPENDS:${PN} += ""

inherit rpm
