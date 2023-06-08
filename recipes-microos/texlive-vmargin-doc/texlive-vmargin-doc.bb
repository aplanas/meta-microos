SUMMARY = "Documentation for texlive-vmargin"
DESCRIPTION = "This package includes the documentation for texlive-vmargin"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.5svn15878"

RPM_NAME = "texlive-vmargin-doc-2023.201.2.5svn15878-53.1.noarch.rpm"
RPM_HASH = "3f836ec1410721dbcb455c72637c74540713a8b1957c9281b4dfa8d618f424d0bb0946f69cf407d8a928068d0f9d1b6deb757e9abea79d39d5ada6fddf8dfa0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-vmargin-doc"
RDEPENDS:${PN} += ""

inherit rpm
