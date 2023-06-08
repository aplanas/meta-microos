SUMMARY = "Documentation for texlive-booktabs"
DESCRIPTION = "This package includes the documentation for texlive-booktabs"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.61803398svn53402"

RPM_NAME = "texlive-booktabs-doc-2023.201.1.61803398svn53402-52.1.noarch.rpm"
RPM_HASH = "4e6a48799f754b17aeb59ea5e027355a0b807eadb2e849763debca3bcba7209337203e76d946275d326d37109ecd555ec006d06b506d1cbc476aeb24be960aa5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-booktabs-doc:en) texlive-booktabs-doc"
RDEPENDS:${PN} += ""

inherit rpm
