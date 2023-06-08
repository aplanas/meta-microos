SUMMARY = "Documentation for texlive-moodle"
DESCRIPTION = "This package includes the documentation for texlive-moodle"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn65672"

RPM_NAME = "texlive-moodle-doc-2023.201.1.0svn65672-54.1.noarch.rpm"
RPM_HASH = "8887368a85b411077f42c7517f08e32afb1bdf11d98a5fc56927864a9d7dd609be3b31448565588cb7428dbaeac92eec8366db82cb66f10236cc5630c74f24b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-moodle-doc"
RDEPENDS:${PN} += ""

inherit rpm
