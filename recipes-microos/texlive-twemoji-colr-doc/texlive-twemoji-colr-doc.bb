SUMMARY = "Documentation for texlive-twemoji-colr"
DESCRIPTION = "This package includes the documentation for texlive-twemoji-colr"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.7.0svn64854"

RPM_NAME = "texlive-twemoji-colr-doc-2023.201.0.0.7.0svn64854-52.1.noarch.rpm"
RPM_HASH = "92d44c6b01d2f1411abb97b7443cb820cad2a2eb686b67b1a5a3bac11d18c9403b64186ba39574e3138e3d8e4c6f678496d66e3862f2d49f3928506bbf980d0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-twemoji-colr-doc"
RDEPENDS:${PN} += ""

inherit rpm
