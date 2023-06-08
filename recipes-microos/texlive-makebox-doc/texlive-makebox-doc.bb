SUMMARY = "Documentation for texlive-makebox"
DESCRIPTION = "This package includes the documentation for texlive-makebox"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn15878"

RPM_NAME = "texlive-makebox-doc-2023.201.0.0.1svn15878-52.1.noarch.rpm"
RPM_HASH = "ed0bb05c27138267ec78faa0ae080f50247b8827e92c9942e28b897be23dfc8cf037aef1a5cea1525116855f63f056c05051ed7214f537ab8e8f953148c6d90f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-makebox-doc"
RDEPENDS:${PN} += ""

inherit rpm
