SUMMARY = "Documentation for texlive-sciposter"
DESCRIPTION = "This package includes the documentation for texlive-sciposter"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.18svn15878"

RPM_NAME = "texlive-sciposter-doc-2023.201.1.18svn15878-53.1.noarch.rpm"
RPM_HASH = "1bc4d0126a074f58876d26ad389ecc5a48c3a6b3faa85b98e931c0ba23e6e0e47a37398643ec90fae49e019d87ba7900cf1008020b6adc1390c42c7db98596cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sciposter-doc"
RDEPENDS:${PN} += ""

inherit rpm
