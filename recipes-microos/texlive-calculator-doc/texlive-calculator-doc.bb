SUMMARY = "Documentation for texlive-calculator"
DESCRIPTION = "This package includes the documentation for texlive-calculator"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1svn64424"

RPM_NAME = "texlive-calculator-doc-2023.201.2.1svn64424-52.1.noarch.rpm"
RPM_HASH = "3b5afba4f592b99fd6c945cf1b5be9e4053e5e6b448ced338fc6e15364c5f9570c35ba4dc7a36a69a2bebc382a46482bd236c2aee0b06db01fe348d060c9f1ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-calculator-doc"
RDEPENDS:${PN} += ""

inherit rpm
