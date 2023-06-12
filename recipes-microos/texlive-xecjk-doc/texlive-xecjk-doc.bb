SUMMARY = "Documentation for texlive-xecjk"
DESCRIPTION = "This package includes the documentation for texlive-xecjk"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.9.1svn64059"

RPM_NAME = "texlive-xecjk-doc-2023.201.3.9.1svn64059-52.1.noarch.rpm"
RPM_HASH = "119255251b25823a699c8ba3b221abf9936021aac25965969b44d973d55524d87db737007ad027d7dfddc9489d27a37d0c117440ce4281e1fc6ba9cd71c3553d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-xecjk-doc:zh) \
texlive-xecjk-doc"
RDEPENDS:${PN} += ""

inherit rpm
