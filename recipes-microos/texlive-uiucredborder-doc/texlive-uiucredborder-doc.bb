SUMMARY = "Documentation for texlive-uiucredborder"
DESCRIPTION = "This package includes the documentation for texlive-uiucredborder"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.00svn29974"

RPM_NAME = "texlive-uiucredborder-doc-2023.201.1.00svn29974-53.1.noarch.rpm"
RPM_HASH = "aad07a34f80f900cdb5c375da3ccc25dba8d6ea72517ba34a27f74837bf54bb288f1e7b7e29358eb3a8811718f38dc5710393e07a5a8dd8301f28c4dba2ac6eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uiucredborder-doc"
RDEPENDS:${PN} += ""

inherit rpm
