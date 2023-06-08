SUMMARY = "Documentation for texlive-uplatex"
DESCRIPTION = "This package includes the documentation for texlive-uplatex"
LICENSE = "BSD-3-Clause"

PV = "2023.201.svn66186"

RPM_NAME = "texlive-uplatex-doc-2023.201.svn66186-53.1.noarch.rpm"
RPM_HASH = "4889c4e0421053fb54b25553f5c1eca4e065ec3b5ed95fbd95213a25851c6ef417ccf85297f649d99f661c7fb5ab2cbac44eb71d74605c3c8e28c7e31792eee5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-uplatex-doc:ja) man(uplatex.1) texlive-uplatex-doc"
RDEPENDS:${PN} += ""

inherit rpm
