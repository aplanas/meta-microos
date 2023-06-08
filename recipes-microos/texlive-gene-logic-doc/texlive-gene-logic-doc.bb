SUMMARY = "Documentation for texlive-gene-logic"
DESCRIPTION = "This package includes the documentation for texlive-gene-logic"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn15878"

RPM_NAME = "texlive-gene-logic-doc-2023.201.1.4svn15878-52.1.noarch.rpm"
RPM_HASH = "fdbd4742cee6473e7ca796bfadc0a7505fa1887ce0163fcd069d0aeeac715e12149d98d49aef2596676069988058196456fff9b7b2d91fa7df9a0f5d8f853169"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gene-logic-doc"
RDEPENDS:${PN} += ""

inherit rpm
