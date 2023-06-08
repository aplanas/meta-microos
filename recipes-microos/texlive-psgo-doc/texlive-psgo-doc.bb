SUMMARY = "Documentation for texlive-psgo"
DESCRIPTION = "This package includes the documentation for texlive-psgo"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.17svn15878"

RPM_NAME = "texlive-psgo-doc-2023.201.0.0.17svn15878-52.1.noarch.rpm"
RPM_HASH = "354c70c69e6eb8d6787b29cdc06d46777a42a38bfb684ef6c8a1e2150cd79d0473622007b381d626b7d82d6ba4a0ec27ff28bccd0613bebb6a58f629cbbee8af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-psgo-doc"
RDEPENDS:${PN} += ""

inherit rpm
