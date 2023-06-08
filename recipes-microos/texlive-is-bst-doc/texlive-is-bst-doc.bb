SUMMARY = "Documentation for texlive-is-bst"
DESCRIPTION = "This package includes the documentation for texlive-is-bst"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.03svn52623"

RPM_NAME = "texlive-is-bst-doc-2023.201.2.03svn52623-55.1.noarch.rpm"
RPM_HASH = "7294439af8e6109ddc452938d217ace68d4987be139382de97e7a53d42915029eacd4390c63e06b619a1bd1865512bdb07370982e035563cb906a973e0fa1266"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-is-bst-doc"
RDEPENDS:${PN} += ""

inherit rpm
