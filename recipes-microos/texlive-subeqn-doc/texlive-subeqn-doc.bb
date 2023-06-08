SUMMARY = "Documentation for texlive-subeqn"
DESCRIPTION = "This package includes the documentation for texlive-subeqn"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0bsvn15878"

RPM_NAME = "texlive-subeqn-doc-2023.201.2.0bsvn15878-57.1.noarch.rpm"
RPM_HASH = "45cf9764a1ff687055c061f7099e066bd0fd25ad6895e1f47dd8127e8fadda5166582112e6699a73d7ef3f625d2e92dfd542cd579d44d70b13765c72233cdece"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-subeqn-doc"
RDEPENDS:${PN} += ""

inherit rpm
