SUMMARY = "Documentation for texlive-biblatex-apa"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-apa"
LICENSE = "LPPL-1.0"

PV = "2023.201.9.16svn63719"

RPM_NAME = "texlive-biblatex-apa-doc-2023.201.9.16svn63719-53.1.noarch.rpm"
RPM_HASH = "ecf9d88524895dca2286362ad0f711604821f44283c9f806d78019de160c4ef3a9d09ad913cd543cd560cee8ac4507d5bf5e7309674af9abf0d3ade9bdf376a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-apa-doc"
RDEPENDS:${PN} += ""

inherit rpm
