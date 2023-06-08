SUMMARY = "Documentation for texlive-beamer-rl"
DESCRIPTION = "This package includes the documentation for texlive-beamer-rl"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.8svn65725"

RPM_NAME = "texlive-beamer-rl-doc-2023.201.1.8svn65725-53.1.noarch.rpm"
RPM_HASH = "606730f39167b8bebba45c14700345c9f6be90d1306d211aac940e5cc45a555b8afb5fb0ae16b8788457ca08478b73a44ae6bd253a743e9873cc98a4e0dd98d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-beamer-rl-doc:ar;en) texlive-beamer-rl-doc"
RDEPENDS:${PN} += ""

inherit rpm
