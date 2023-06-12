SUMMARY = "Documentation for texlive-mwcls"
DESCRIPTION = "This package includes the documentation for texlive-mwcls"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.75svn44352"

RPM_NAME = "texlive-mwcls-doc-2023.201.0.0.75svn44352-54.1.noarch.rpm"
RPM_HASH = "af64a693bf905028fe03b729f30b034e678db69f3b852a81839a92f7aa1c19f906182fedb54de4dfbecae123291d8439caed18c819c510778db84d3f7494fae4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-mwcls-doc:pl;en) \
texlive-mwcls-doc"
RDEPENDS:${PN} += ""

inherit rpm
